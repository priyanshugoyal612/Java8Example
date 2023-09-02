package com.phase2.immutable.example;

import java.util.HashMap;
import java.util.Map;


/**
 * @author priyanshu.goyal
 *
 *The class must be declared as final so that child classes can’t be created.
Data members in the class must be declared private so that direct access is not allowed.
Data members in the class must be declared as final so that we can’t change the value of it after object creation.
A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)
 *
 *
 */
//1Class Should be final
public final class Student {

	// 2 filed should be private final
	private final int id;
	private final String name;
	private final Map<String, String> metadata;

	// 3 Parameterized Constructor
	public Student(int id, String name, Map<String, String> metadata) {
		this.id = id;
		this.name = name;
		Map<String, String> tempMap = new HashMap<>();
		//Deep copy
		for (Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());

		}
		this.metadata = tempMap;
	}

	// 4 Only Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Map<String, String> getMetadata() {
		Map<String, String> tempMap = new HashMap<>();

		for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());

		}
		return tempMap;
	}
}