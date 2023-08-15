package com.java8.examples;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortMapByValues {

	public static void main(String args[]) {
		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("j", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);
		System.out.println("Unsorted Map :  " + unsortMap);

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

	System.out.println(list);
	Map<String, Integer> m2 = new LinkedHashMap<String, Integer>();
	for(Map.Entry<String,Integer> m : list)
	{
		m2.put(m.getKey(), m.getValue());
	}
	System.out.println(m2);
	//converting sorted map
	//Map<String, Integer> unsortMap2 =list.stream().collect(Collectors.toMap(Function.identity(),Function.identity()));
	
	}
	
	

}
