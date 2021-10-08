package com.afdp.factory_of_factory;

import com.afdp.factory.DAOFactory;
import com.afdp.factory.DBDaoFactory;
import com.afdp.factory.XMLDaoFactory;

public class DaoMaker {		//this is the Abstract Factory or factory of factory.

	public static DAOFactory make(String persistanceType) {
		
		if("xml".equals(persistanceType)) {
			return new XMLDaoFactory();
		}
		else if("db".equals(persistanceType)) {
			return new DBDaoFactory();
		}
		
		return null;
	}
}
