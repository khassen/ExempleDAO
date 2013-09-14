package fr.treeptik.sample.dao;

import java.util.List;

import fr.treeptik.sample.dao.domain.Employee;

public interface EmployeeDAO {
	
	void save(Employee employee);
	void remove(Employee employee);
	Employee findById(Integer id);
	List<Employee> findAll();

}
