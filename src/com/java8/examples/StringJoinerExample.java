package com.java8.examples;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner("-");
		
		stringJoiner.add("Priyanshu");
		stringJoiner.add("Sudhanshu");
		stringJoiner.add("Divayanshu");
		stringJoiner.add("Nishant");
		stringJoiner.add("Shivanshu");
		System.out.println(stringJoiner);

	}

}
