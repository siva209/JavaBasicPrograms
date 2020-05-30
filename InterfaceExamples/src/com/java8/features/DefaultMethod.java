package com.java8.features;
interface Cm{
	void m2();
	void m3();
	default void m4() {
		System.out.println("hello");
	}
	
}
public class DefaultMethod implements Cm {

	

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("how r u");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("see");
	}
public static void main(String[] args) {
Cm d=new DefaultMethod()	;
d.m2();
d.m3();
d.m4();
}
}
