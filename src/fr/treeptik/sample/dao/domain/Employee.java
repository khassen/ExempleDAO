package fr.treeptik.sample.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;

	private String firstName;
	
	private String lastName;
	private Date birthday;
	public Employee() {
		super();
	}
	public Employee(int id, String firstName, String lastName, Date birthday) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
