package com.java8.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Product {

	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class StreamExample {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Introduced in Java 8, the Stream API is used to process collections of
		 * objects. A stream is a sequence of objects that supports various methods
		 * which can be pipelined to produce the desired result.
		 */

		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> productPrices = productsList.stream().filter(product -> product.price > 30000f)
				.map(product -> product.price).collect(Collectors.toList());
		System.out.println(productPrices);

		/// Total Sum
		double sum = productsList.stream().collect(Collectors.summingDouble(p -> p.price));
		System.out.println(sum);

		// Count

		Long count = productsList.stream().filter(p -> p.price > 10000f).count();
		System.out.println(count);

		// convert list into set

		Set<Float> productPriceSet = productsList.stream().filter(p -> p.price > 10000).map(p -> p.price)
				.collect(Collectors.toSet());
		System.out.println(productPriceSet);

		// convert list to map
		Map<Integer, String> productMap = productsList.stream().collect(Collectors.toMap(x -> x.id, y -> y.name));
		System.out.println(productMap);

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(6);
		//sum
		System.out.println(list.stream().collect(Collectors.summingInt(Integer::valueOf)));
		Integer result=list.stream().reduce(Integer::sum).get();
		System.out.println(result);
		
		//distinct
		
		List<Integer> fList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(fList);
		
		
	}

}
