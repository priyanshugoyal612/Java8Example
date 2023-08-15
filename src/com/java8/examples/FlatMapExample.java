package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
	
	// Java 8 Stream flatMap() method is used to flatten a Stream of collections to
	// a stream of objects.
	// The objects are combined from all the collections in the original Stream.
	// The flatMap() operation has the effect of applying a one-to-many
	// transformation to the elements of the stream
	// and then flattening the resulting elements into a new stream.
	
	public static void main(String args [])
	{
		List<String> list1 = Arrays.asList("Jatin", "Goswami", "Sakhi");
		List<String> list2 = Arrays.asList("Nitin", "Saching", "Meenakhsi");
		List<String> list3 = Arrays.asList("Niavish", "Chetan", "Shubham");
		List<List<String>> finalList = Arrays.asList(list1, list2, list3);
		System.out.println(finalList);
		List<String> result =finalList.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
		System.out.println(result);
		
		List<Integer> listI1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> listI2=Arrays.asList(11,12,13,14,15,16);
		List<Integer> listI3=Arrays.asList(21,22,23,24,25,26);
		List<Integer> listI4=Arrays.asList(31,32,33,34,35,36);
		List<List<Integer>> finalInteger = Arrays.asList(listI1, listI2, listI3,listI4);
		
		List<Integer> finalResult = finalInteger.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
		System.out.println(finalResult);
		
		
	}

}
