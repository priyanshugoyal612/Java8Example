package com.java8.custom.annotation.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author priyanshu.goyal
 *
 *
 *	Class Level Annotation
 *	Field Level Annotation
 *	Method Level Annotation
 *
 *The first step to creating a custom annotation is to declare it using the @interface keyword :
 *The next step is to specify the scope and the target of our custom annotation :
 *Retention(RetentionPolicy.RUNTIME)
 *	@Target(ElementType.Type)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface GFC {

}
