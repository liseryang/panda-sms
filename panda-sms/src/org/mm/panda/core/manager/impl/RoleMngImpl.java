package org.mm.panda.core.manager.impl;

import java.io.Serializable;

import org.mm.panda.common.hibernate3.Updater;
import org.mm.panda.core.CoreManagerImpl;
import org.mm.panda.core.dao.RoleDao;
import org.mm.panda.core.entity.Admin;
import org.mm.panda.core.entity.Role;
import org.mm.panda.core.manager.RoleMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleMngImpl extends CoreManagerImpl<Role> implements RoleMng {

	@Autowired
	public void setRoleDao(RoleDao dao) {
		super.setDao(dao);
	}

	protected RoleDao getRoleDao() {
		return (RoleDao) super.getDao();
	}

	@Override
	public Object updateByUpdater(Updater updater) {
		Role role = (Role) super.updateByUpdater(updater);
		Admin.funcChange();
		return role;
	}

	@Override
	public Role save(Role role) {
		super.save(role);
		return role;
	}

	@Override
	public Role findById(Serializable id) {
		Role role = super.findById(id);
		return role;
	}

	@Override
	public Role deleteById(Serializable id) {
		Role role = super.deleteById(id);
		return role;
	}

}
