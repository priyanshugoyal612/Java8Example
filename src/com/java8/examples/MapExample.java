package com.java8.examples;

import java.util.List;
import java.util.stream.Collectors;

/**
 * We are going to map Employee  CompanyName to Address Object
 * 
 * @author priyanshu.goyal
 *
 */
public class MapExample {

	public static void main(String[] args) {

		List<Employee> employeeList = Employee.getList();

		List<Address> companyAddress = employeeList.stream()
				// .filter(emp->emp.getCompanyName().equals(""))
				.map(emp -> {

					Address address = new Address();
					address.setAddressName(emp.getCompanyName());
					return address;

				}).collect(Collectors.toList());

		System.out.println(companyAddress);

	}

}
