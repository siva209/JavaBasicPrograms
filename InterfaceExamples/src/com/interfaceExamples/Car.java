package com.interfaceExamples;
interface Vehicle{
	void geras(); /* abstract methods */
void speed();
void engineSpeed();
	/*
	 * default method .It means this method not override .This is directly calling
	 */
default void display() {
	System.out.println("all information about ");
}

}
class Bike implements Vehicle{

	@Override
	public void geras() {
		System.out.println("6 gears");
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println(100);
	}

	@Override
	public void engineSpeed() {
		// TODO Auto-generated method stub
		System.out.println("120cc");
	}
	void operators() {
		System.out.println("siva");
	}
	
}
class Tvs implements Vehicle{

	@Override
	public void geras() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	public void speed() {
		System.out.println("120");
		
	}

	@Override
	public void engineSpeed() {
		System.out.println("100cc");
		
	
	}
	public void seeting() {
		System.out.println("super");
	}
	
	
}
public class Car {
	public static void main(String[] args) {
		Bike t=new Bike();
		t.engineSpeed();
		t.speed();
		t.display();
		t.geras();
		Tvs tv=new Tvs();
		tv.engineSpeed();
		tv.geras();
		tv.speed();
		
		
		
	}
}
