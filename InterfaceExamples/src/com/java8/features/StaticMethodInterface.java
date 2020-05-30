package com.java8.features;


interface Pm{
	final int y=100;
	static void display() {
		System.out.println("hello");
	}
	
}
public class StaticMethodInterface implements Pm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pm.display();

	}
	
}
