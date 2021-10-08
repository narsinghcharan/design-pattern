package com.afdp.factory;

import com.afdp.dao.Dao;
import com.afdp.dao.XMLDeptDao;
import com.afdp.dao.XMLEmpDao;

public class XMLDaoFactory implements DAOFactory
{

	@Override
	public Dao getDAO(String type) {

		Dao dao = null;
		if("emp".equals(type)) {
			dao = new XMLEmpDao();
		} 
		else if("dept".equals(type)) {
			dao = new XMLDeptDao();
		}
		
		return dao;
	}
}
