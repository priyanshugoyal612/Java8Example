package com.java8.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeMainClass {
	
	public static void main(String[] args) {
		
		List<Integer> listInteger = Arrays.asList(9,2,3,3,4,44,55);
		
		Collections.sort(listInteger, Comparator.reverseOrder());
		System.out.println(listInteger);
		listInteger.sort(null);
		System.out.println(listInteger);
		System.out.println(listInteger.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		
		List<String> fruits = Arrays.asList("Apple","Apple","Mango","Mango","Mango","Banana");
		
		Map<String, Long> groupHashMap = fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		for(Entry entry : groupHashMap.entrySet())
		{
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
		
		String resut=groupHashMap.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
		.map(Map.Entry::getKey).get();
		System.out.println(resut);
	
	}
}