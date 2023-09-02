package com.phase2.immutable.example;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();

		map.put("1", "first");
		map.put("2", "second");

		Student s = new Student(1, "Priyanshu", map);
		System.out.println(s.getId() + s.getName() + s.getMetadata());

		// Uncommenting below line causes error
		// s.id = 102;

		map.put("3", "third");

		System.out.println(s.getMetadata());

		s.getMetadata().put("4", "fourth");
		// Remains unchanged due to deep copy in getter
		System.out.println(s.getMetadata());

		Person p1 = new Person(1, "p1");
		Person p2 = new Person(2, "p2");
		Person p3 = new Person(3, "p3");
		Map<Person, String> persons = new HashMap<Person, String>();
		persons.put(p1,"p1");
		persons.put(p2,"p2");
		persons.put(p3,"p3");
		System.out.println(persons.size());
		System.out.println(persons.get("p2"));
	
	}
	
	
	
	
}

class Person {

	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {

		int result = 1;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		return false;
	}

}
