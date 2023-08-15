package com.java8.examples;

@FunctionalInterface
interface Testing {

	public void say();

	public default void defaultMethod() {
		System.out.println("Default Methods");
	}

	public static void staticMethod() {
		System.out.println("Static Method");
	}

}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		Testing t = new Testing() {

			@Override
			public void say() {
				System.out.println("Hello how are u Anomynous Way");

			}

		};

		t.say();
		t.defaultMethod();
		Testing.staticMethod();

		Testing t2 = () -> System.out.println("I am landa");
		t2.say();

	}

}
