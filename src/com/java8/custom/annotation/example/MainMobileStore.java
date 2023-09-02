package com.java8.custom.annotation.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedArrayType;

public class MainMobileStore {

	public static void main(String[] args) {
		
		Nokia nokia = new Nokia();
		
		Class clas = nokia.getClass();
		
		SmartPhone sm=(SmartPhone) clas.getAnnotation(SmartPhone.class);
		System.out.println(sm.os());
		System.out.println(sm.version());
		System.out.println(sm.os());

	}

}
