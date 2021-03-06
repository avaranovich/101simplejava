package org.softlang.company.model;

import java.io.Serializable;

/**
 * An employee has a salary and some person information
 * 
 */
public class Employee extends Subunit implements Serializable {

	private static final long serialVersionUID = -210889592677165250L;

	private String name;
	private String address;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double total() {
		return getSalary();
	}	
	
	public void cut() {
		setSalary(getSalary() / 2);
	}	
}
