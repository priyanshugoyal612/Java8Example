package com.java8.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ByteProgramingJava8Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = employeeListData();

		// 1st Question Show All Employee using Java 8
		System.out.println("1st Question Show All Employee using Java 8");
		empList.stream().forEach(emp -> System.out.println(emp)); // empList.stream().forEach (System.out::println);

		// 2nd Question showing the employee having id less than 30
		System.out.println("2nd Question showing the employee having id less than 30");
		empList.stream().filter(emp -> emp.getId() < 30).forEach(System.out::println);

		// 3 rd Count of employee having id less than 30;
		long count = empList.stream().filter(x -> x.getId() < 30).count();
		System.out.println("Count of employee having id less than 30 : " + count);

		// 4th question grouping the employees with similar company and having id less
		// than 30
		System.out.println("4th question grouping the employees with similar company and having id less than 30 ");
		// chaining
		System.out.println(empList.stream().filter(x -> x.getId() < 30)
				.collect(Collectors.groupingBy(emp -> emp.getCompanyName())));

		// 5 th Count all employees from the list from the same company and id less than
		// 30
		System.out.println(empList.stream().filter(x -> x.getId() < 30)
				.collect(Collectors.groupingBy(Employee::getCompanyName, Collectors.counting())));

		System.exit(0);
		
		

		// sorting the employee on the basis of id

		empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		int id = empList.stream().max(Comparator.comparing(Employee::getId)).get().getId();
		System.out.println(id);

		// Grouping the employee by companny name

		Map<String, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getCompanyName));
		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});

	}

	private static List<Employee> employeeListData() {
		List<Employee> empList = Arrays.asList(new Employee(9, "Priyanshu", "UKG"), new Employee(3, "Mrinal", "L&T"),
				new Employee(1, "Prashant", "Kronos"), new Employee(9, "Prashant", "Kronos"),
				new Employee(98, "Prashant", "Kronos"));
		return empList;
	}

}
