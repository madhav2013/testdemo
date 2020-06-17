package com.capgemini.Lambda;

interface HelloWorld {
	String hello(String name);
}
public class LambdaTest {
	
	

	public static void main(String[] args) {
		HelloWorld helloWorld = (name) -> {
			return "Hello " + name;
		};
		System.out.println(helloWorld.hello("Kolaparthi"));
	}
}