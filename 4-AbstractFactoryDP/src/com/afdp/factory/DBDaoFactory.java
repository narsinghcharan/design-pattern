package com.afdp.factory;

import com.afdp.dao.DBDeptDao;
import com.afdp.dao.DBEmpDao;
import com.afdp.dao.Dao;

public class DBDaoFactory implements DAOFactory {

	@Override
	public Dao getDAO(String type) {

		Dao dao = null;
		if("emp".equals(type)) {
			dao = new DBEmpDao();
		}
		else if("dept".equals(type)) {
			dao = new DBDeptDao();
		}
		
		return dao;
	}

	
}
