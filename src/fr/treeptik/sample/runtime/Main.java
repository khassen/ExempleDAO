package fr.treeptik.sample.runtime;

import java.util.List;

import fr.treeptik.sample.dao.DAOFactory;
import fr.treeptik.sample.dao.EmployeeDAO;
import fr.treeptik.sample.dao.domain.Employee;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
		 List<Employee> all = employeeDAO.findAll();
		 
		
		

	}

}
