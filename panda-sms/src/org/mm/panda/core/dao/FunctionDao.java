package org.mm.panda.core.dao;

import java.util.List;

import org.mm.panda.core.CoreDao;
import org.mm.panda.core.entity.Function;

public interface FunctionDao extends CoreDao<Function> {
	/**
	 * 获得管理员的权限
	 * 
	 * @param adminId
	 * @return
	 */
	public List<Function> getFunctions(Integer adminId);

	/**
	 * 获得所有根节点
	 * 
	 * @return
	 */
	public List<Function> getRoots();

	/**
	 * 获得子节点
	 * 
	 * @param pid
	 * @return
	 */
	public List<Function> getChild(Integer pid);
}
