package fr.treeptik.sample.dao;

import fr.treeptik.sample.dao.impl.EmployeeJDBCImpl;

public class DAOFactory {
	
	public static EmployeeDAO getEmployeeDAO(){
		return new EmployeeJDBCImpl();
	}
	

}
