package com.afdp.factory;

import com.afdp.dao.Dao;

public interface DAOFactory {		//this is not factory of factory (abstract factory)

	public Dao getDAO(String type);
}
