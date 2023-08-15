package com.java8.examples;

import java.util.ArrayList;
import java.util.List;


public class Employee implements Comparable<Employee>{
	
	
	private int id;
	private String name;
	private String companyName;
	
	
	public Employee(int id, String name, String companyName) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", companyName=" + companyName + "]";
	}
	
	public static List<Employee> getList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Brishketu", "UKG"));
		empList.add(new Employee(2, "Nitin", "TCS"));
		empList.add(new Employee(3, "Manish", "Cognizant"));
		empList.add(new Employee(4, "Brishketu", "L&T"));
		return empList;
	}

}
