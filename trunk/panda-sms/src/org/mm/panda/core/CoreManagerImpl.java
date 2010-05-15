package org.mm.panda.core;

import java.io.Serializable;

import org.mm.panda.common.hibernate3.BaseManagerImpl;

public class CoreManagerImpl<T extends Serializable> extends
		BaseManagerImpl<T> implements CoreManager<T> {
}
