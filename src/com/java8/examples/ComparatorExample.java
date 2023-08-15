package com.java8.examples;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {

	public static Comparator<Employee> name = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {

			return o1.getName().compareTo(o2.getName());
		}

	};

	public static void main(String[] args) {

		List<Employee> employees = Employee.getList();

		employees.sort(Comparator.comparing(emp -> emp.getName()));
		System.out.println("Emplooyee Sorted By Name " + employees);
		employees.sort(Comparator.comparing(Employee::getId).reversed());// Method References
		System.out.println("Emplooyee Sorted By Id in reverse order " + employees);
		// chaining of comprator
		employees.sort(Comparator.comparing(Employee::getCompanyName).thenComparing(Employee::getId));
		System.out.println("chaining of comprator" + employees);

		List<Employee> sortedEmployeeByCompanyName = employees.stream()
				.sorted(Comparator.comparing(Employee::getCompanyName)).collect(Collectors.toList());
		System.out.println(sortedEmployeeByCompanyName);

		System.out.println("Sorting the employee on the basis of name");

		Collections.sort(employees, name);
		System.out.println(employees);

	}

}
