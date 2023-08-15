package com.java8.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OptionalClassExample {
	public static Predicate<Employee> empPredicate = new Predicate<Employee>() {

		@Override
		public boolean test(Employee t) {
			// TODO Auto-generated method stub
			return false;
		}
	};


	public static void main(String[] args) {
		
		
		List<Employee> empList = Employee.getList();
		Optional<List<Employee>> emp = Optional.ofNullable(empList);
		System.out.println(emp.isPresent());
		
		Optional<Employee> empObj = empList.stream().filter(e -> e.getName().equals("MSa")).findAny();
		System.out.println(empObj.isPresent());
		
		Predicate<Employee> predicateEmp = e -> e.getName().equals("Jatin");
		
		

		
		
		
		
		//Probelm by Jatin in intervew
		List<String> fruits = Arrays.asList("Banana", "Apple", "Orange", "Banana", "Apple", "Banana");

		Map<String, Long> result = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(result);
		
		String max = result.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).get();

		System.out.println(max);
		
	}

}

