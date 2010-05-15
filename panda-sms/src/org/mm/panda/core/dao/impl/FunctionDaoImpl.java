package org.mm.panda.core.dao.impl;

import java.util.List;

import org.mm.panda.core.CoreDaoImpl;
import org.mm.panda.core.dao.FunctionDao;
import org.mm.panda.core.entity.Function;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository
public class FunctionDaoImpl extends CoreDaoImpl<Function> implements
		FunctionDao {

	@Override
	public List<Function> getChild(Integer pid) {
		String hql = "select func from Function func where func.parent.id = ? order by func.priority asc";
		return this.find(hql, pid);
	}

	@Override
	public List<Function> getFunctions(Integer adminId) {
		String hql = "select func from Function func where func.id in"
				+ " (select f1.id from Admin admin join admin.roles role join role.functions f1 where admin.id = ?) or func.id in "
				+ " (select f2.id from Admin admin join admin.functions f2 where admin.id = ?)"
				+ " order by func.priority asc";
		return find(hql, adminId, adminId);
	}

	@Override
	public List<Function> getRoots() {
		String hql = "select func from Function func where func.parent.id is null order by func.priority asc";
		return find(hql);
	}

}
