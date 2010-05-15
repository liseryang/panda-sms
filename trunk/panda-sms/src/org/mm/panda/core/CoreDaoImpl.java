package org.mm.panda.core;

import java.io.Serializable;

import org.mm.panda.common.hibernate3.BaseDaoImpl;

public class CoreDaoImpl<T extends Serializable> extends BaseDaoImpl<T>
		implements CoreDao<T> {

}
