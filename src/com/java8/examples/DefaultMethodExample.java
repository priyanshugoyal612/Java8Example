package com.java8.examples;

@FunctionalInterface
interface Sayable {

	default void say() {
		System.out.println("Hello this is the default Method");
	}

	static void staticSay() {
		System.out.println("Hello, this is static method");
	}

	default void say1() {
		System.out.println("Hello this is the default Method");
	}

	static void staticSay2() {
		System.out.println("Hello, this is static method");
	}

	// Abstract Method
	void sayMore(String name);

	// void sayMore2(String name);

}

public class DefaultMethodExample {

	public static void main(String[] args) {

		Sayable s = (e) -> System.out.println("Hello " + e);
		s.sayMore("Priyanshu");
		s.say1();
		Sayable.staticSay();

	}
}