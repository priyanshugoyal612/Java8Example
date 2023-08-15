package com.java8.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Hosting {

	private Integer Id;
	private String name;
	private Long websites;

	@Override
	public String toString() {
		return "Hosting [Id=" + Id + ", name=" + name + ", websites=" + websites + "]";
	}

	public Hosting(Integer id, String name, Long websites) {
		Id = id;
		this.name = name;
		this.websites = websites;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getWebsites() {
		return websites;
	}

	public void setWebsites(long websites) {
		this.websites = websites;
	}
}

public class ListToMapExample {

	public static void main(String[] args) {
		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80500l));
		list.add(new Hosting(2, "linode.com", 91000l));
		list.add(new Hosting(3, "digitalocean.com", 120000l));
		list.add(new Hosting(4, "aws.amazon.com", 200000l));
		list.add(new Hosting(5, "mky1ong.com", 90300l));
		list.add(new Hosting(6, "mk2yong.com", 120000l));
		list.add(new Hosting(7, "mky4ong.com", 800077l));
		list.add(new Hosting(8, "mky3ong.com", 1207000l));
		list.add(new Hosting(9, "mkyo4ng.com", 800777700l));

		Map<Integer, Hosting> result = list.stream().collect(Collectors.toMap(Hosting::getId, Function.identity()));
		System.out.println(result);

		// key = id, value - websites
		Map<Integer, Long> result1 = list.stream().collect(Collectors.toMap(x -> x.getId(), y -> y.getWebsites()));
		System.out.println("Result 1 : " + result1);
		
		// key = id, value - Names
		Map<Integer, String> result2 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
		System.out.println("Result 2 : " + result2);
		
		// Same with result2, just different syntax
		// key = id, value = name
		Map<Integer, String> result3 = list.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));
		System.out.println("Result 3 : " + result3);
		
		//sorting on the basis of website
		List<Hosting> sorted=list.stream().sorted(Comparator.comparing(Hosting::getWebsites).thenComparing(Hosting::getName)).collect(Collectors.toList());
		System.out.println("Sorted List" + sorted);

	}

}
