package com.java8.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author priyanshu.goyal
 * 
 *         //3 ways Sorting List in the natural order
 *          1. using Stream //
 *         list.stream().sorted().collect(Collectors.toList());
 *          2. Using Collections.sort() Collections.sort(unsorted);
 *          3. Using List.sort()
 * 
 *         for reverse order
 *         1) Stream 
 *         integerListUnsorted.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
 *         2. using Collections.sort()
 *          Collections.sort(names,
 *         Comparator.reverseOrder());

 *         3. List.sort
 * 
 *         chaining of comparison on the basis of name, id is doenby implementing comparable interface
 *			ref
 *			https://www.java67.com/2021/09/3-ways-to-sort-list-in-java-8-and-11.html
 */
public class SortingListUsingJava8 {

	public static void main(String[] args) {
		// sorting list in natural order
		
		// -------------------------sort in natural sorting order ---------------------------------------
		// Integer List same applicable to string
		List<Integer> integerListUnsorted = Arrays.asList(1, 2, 3, 54, 6, 748, 52, 4);
		System.out.println("unsorted interger list : " + integerListUnsorted);

		// 1) using Stream.sort
		List<Integer> sortedIntegerList = integerListUnsorted.stream().sorted().collect(Collectors.toList());
		System.out.println("1 sorted list using Java 8 Stream:  " + sortedIntegerList.toString());
		// sysout [1, 2, 3, 4, 6, 52, 54, 748]
		
		// Sorting the String array using java 8
		List<String> names = Arrays.asList("priyanshu", "shivanshu", "nishant", "divyanshu");
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames.toString()); // [divyanshu, nishant, priyanshu, shivanshu]

		// 2 Using Collections.sort()
		List<Integer> collectionUnsorted = Arrays.asList(999, 200, 1, 2, 3, 54, 6, 748, 52, 4);
		Collections.sort(collectionUnsorted);
		System.out.println("2 sorted list using Collections.sort(): " + collectionUnsorted.toString());
		// sysout [1, 2, 3, 4, 6, 52, 54, 200, 748, 999]

		// 3 List.sort()
		List<Integer> unsorted = Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);
		unsorted.sort(null);
		// method expects a Comparator, but you can pass a null value as well. The null
		// means list will be sorted in the natural order of elements
		System.out.println(unsorted.toString());
		// sysout [1, 2, 3, 4, 6, 52, 54, 200, 748, 999]

		// -------------------------sort in Reverse order ---------------------------------------
		
		// in Reverse order Sorting the Integer array using java 8
		// using Strem.sort
		List<Integer> revSorted = integerListUnsorted.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(revSorted.toString());
		// [748, 54, 52, 6, 4, 3, 2, 1]
		

		// String in reverse order
		List<String> revsortedNames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(revsortedNames.toString()); // [shivanshu, priyanshu, nishant, divyanshu]

		
		//----------------------------custome object sorting---------------
		
		// Custom Object Sorting employee we have implemnted comprable interface
		// only name
		List<Employee> empList = employeeListData();
		List<Employee> empListSorted = empList.stream().sorted().collect(Collectors.toList());
		System.out.println(empListSorted.toString());
		

		// chaining of multiple comparison first name then id
		List<Employee> multiplecomparsion = empList.stream()
				.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId))
				.collect(Collectors.toList());
		System.out.println(multiplecomparsion.toString());
		// [Employee [id=3, name=Mrinal, companyName=L&T], Employee [id=1, name=Prashant, companyName=Kronos], Employee [id=9, name=Prashant,
		// companyName=Kronos], Employee [id=98, name=Prashant, companyName=Kronos],  Employee [id=9, name=Priyanshu, companyName=UKG]]

	}

	private static List<Employee> employeeListData() {
		List<Employee> empList = Arrays.asList(new Employee(9, "Priyanshu", "UKG"), new Employee(3, "Mrinal", "L&T"),
				new Employee(1, "Prashant", "Kronos"), new Employee(9, "Prashant", "Kronos"),
				new Employee(98, "Prashant", "Kronos"));
		return empList;
	}

}
