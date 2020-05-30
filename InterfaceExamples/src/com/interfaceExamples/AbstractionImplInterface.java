/*Problem:1)Abstraction class implements interface .
         2)Abstraction class extends only one java class.

*/


package com.interfaceExamples; /* interface*/
interface Cell{
	void display();
	
}

/* Here abstraction is implements interface Cell */
abstract class keypad implements Cell{
	void show() {
		System.out.println("hai");
	}
}

/* Here Abstraction class extends Only one java class */
 class AbstractionImplInterface extends keypad  {


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("helo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractionImplInterface a=new AbstractionImplInterface();
a.display();
a.show();
	}


}
