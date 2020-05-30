/* Progrm Desc: Example of Interfaces extends  and Imp main class.*/
/*I have take Two Interfaces and declerad abstract methods ,and concreate methods and declere varibles*/



package com.interfaceExamples;
interface Teacher{
	int x=12;
	void studentInf();
	void address();
	 void s1() ;
		
}
interface MathTeacher extends Teacher{
	void dance();
	void game();
}

public class InterfaceExtendedExamples implements MathTeacher {

	@Override
	public void studentInf() {
		// TODO Auto-generated method stub
		System.out.println("209 roll no");
	}

	@Override
	public void address() {
		// TODO Auto-generated method stub
		System.out.println("thippayapalem");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("super");
	}

	@Override
	public void game() {
		// TODO Auto-generated method stub
		System.out.println("game");
	}
	

	@Override
	public void s1() {
		// TODO Auto-generated method stub
		System.out.println("ss");
	}

public static void main(String[] args) {
	InterfaceExtendedExamples ie=new InterfaceExtendedExamples();
	ie.game();
	ie.s1();
	ie.dance();
	ie.address();
	ie.studentInf();
	System.out.println(ie.x);
}
}
