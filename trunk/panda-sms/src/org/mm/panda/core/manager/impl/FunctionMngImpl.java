package org.mm.panda.core.manager.impl;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.mm.panda.common.hibernate3.Updater;
import org.mm.panda.core.CoreManagerImpl;
import org.mm.panda.core.dao.FunctionDao;
import org.mm.panda.core.entity.Function;
import org.mm.panda.core.manager.AdminMng;
import org.mm.panda.core.manager.FunctionMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FunctionMngImpl extends CoreManagerImpl<Function> implements
		FunctionMng {

	@Autowired
	public void setFunctionDao(FunctionDao functionDao) {
		super.setDao(functionDao);
	}

	public FunctionDao getFunctionDao() {
		return (FunctionDao) super.getDao();
	}

	@Override
	public List<Function> getChild(Integer pid) {
		return this.getChild(pid);
	}

	@Override
	public Set<String> getFunctionItems(Integer adminId) {
		List<Function> funcList = this.getFunctions(adminId);
		Set<String> funcItemSet = new HashSet<String>();
		String url = null;
		String fs = null;
		String[] fa = null;
		for (Function function : funcList) {
			url = function.getUrl();
			if (!StringUtils.isBlank(url)) {
				funcItemSet.add(url);
			}
			fs = function.getFuncs();
			if (!StringUtils.isBlank(fs)) {
				fa = fs.split(Function.FUNC_SPLIT);
				for (String fas : fa) {
					funcItemSet.add(fas);
				}
			}
		}
		return funcItemSet;

	}

	@Override
	public List<Function> getFunctions(Integer adminId) {
		return this.getFunctionDao().getFunctions(adminId);

	}

	@Override
	public List<Function> getRoots() {

		return this.getFunctionDao().getRoots();
	}

	@Override
	public Object updateByUpdater(Updater updater) {
		Function bean = (Function) updater.getBean();
		Function f = findById(bean.getId());
		Function pf = f.getParent();
		Function pbean = bean.getParent();
		// pbean!=null代表需要更新父节点。父节点不能等于自身。
		if (pbean != null && !f.getId().equals(pbean.getId())) {
			// pf!=null原父节点存在，处理原父节点的child
			if (pf != null && !pf.getId().equals(pbean.getId())) {
				pf.getChild().remove(f);
			}
			// pbean.getId()!=null新父节点存在，处理新父节点child
			if (pbean.getId() != null && !pbean.getId().equals(pf.getId())) {
				Function np = findById(pbean.getId());
				np.addToChild(f);
			}
		}
		Function func = (Function) super.updateByUpdater(updater);
		return func;
	}

	@Override
	public Function findById(Serializable id) {
		Function func = super.findById(id);
		return func;
	}

	@Override
	public Function deleteById(Serializable id) {
		Function entity = findById(id);
		Function parent = entity.getParent();
		super.delete(entity);
		if (parent != null) {
			parent.getChild().remove(entity);
		}
		return entity;
	}
}
