/* Here i implement inteface how?
I take one interafe .In Interafce decelere abstract methods.
Now I takee normal class and it imp that intefce.
In main method .create Object of chuild class


*/

package com.interfaceExamples; 

interface Student {                               /* This is my interafec */
	void m1();                                    /* This is my abstract methods */
	void student();
	int x=12;
	public static  final  int y=20;
	public void football();
}




public class InterfcaeImplementExample implements Student {                            /* This my main class And then imp above interafce */

	/*
	                                                                                          + * Override that above interafec method in main class belows
	 */
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("print subject");
	}

	@Override
	public void student() {
		// TODO Auto-generated method stub
		System.out.println("print scores");
	}
	
	@Override
	public void football() {
		System.out.println("max");
		
	}
public static void main(String[] args) {
		
		InterfcaeImplementExample i=new InterfcaeImplementExample();
		i.m1();
		i.student();
		System.out.println(i.x);
		System.out.println(i.y);
		i.football();
		
	}
}
