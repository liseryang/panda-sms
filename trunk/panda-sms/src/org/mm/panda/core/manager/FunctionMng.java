package org.mm.panda.core.manager;

import java.util.List;
import java.util.Set;

import org.mm.panda.core.CoreManager;
import org.mm.panda.core.entity.Function;

public interface FunctionMng extends CoreManager<Function> {

	/**
	 * 获得管理员权限
	 * 
	 * @param adminId
	 * @return
	 */
	public List<Function> getFunctions(Integer adminId);

	/**
	 * 获得管理员权限项集合
	 * 
	 * @param adminId
	 * @return
	 */
	public Set<String> getFunctionItems(Integer adminId);

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