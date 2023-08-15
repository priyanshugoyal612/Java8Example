package com.java8.examples;

/**
 * Lamda Expression is the first step to the functional programming
 * LE can be expressed as a instance of Functional Interface(Interface with only one abstract method. example java.lang.Runnable
 * LE are functions which can be created without belonging to any class.
 * LE can be passed around as if it was an object and can be executed on demand.
 * 
 * @author priyanshu.goyal
 *
 */

@FunctionalInterface
interface Square {

	int calculate(int x);

	default double areaOfCicle(int x) {
		return 3.14 * x;
	}

}

public class LambdaExpresion {

	public static void main(String[] args) {

		int a = 5;
		// lambda expression to define the calculate method
		Square s = x -> x * x;

		int ans = s.calculate(a);
		System.out.println("Area Of square using lamda and fucntional interface" + ans);
		System.out.println("Area Of circle using defaut method" + s.areaOfCicle(20));

	}

}
