package com.afdp.test;

import com.afdp.dao.Dao;
import com.afdp.factory.DAOFactory;
import com.afdp.factory_of_factory.DaoMaker;

public class AFTest {

	public static void main(String[] args) {
		
		DAOFactory factory = null;
		Dao dao = null;
		
		//now I want to use xml family of DAO to perform operations.
	//	factory = DaoMaker.make("xml");

		//and now if I want to use xml family of DAO to perform operations.
		factory = DaoMaker.make("db");
		
		dao = factory.getDAO("emp");
		dao.save();
		dao = factory.getDAO("dept");
		dao.save();
		
		
	}
}
