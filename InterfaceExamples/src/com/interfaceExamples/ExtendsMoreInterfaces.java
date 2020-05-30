package com.interfaceExamples;
interface A{
	void display();
	
}
interface  B{
	void shows();
}
interface C{
	void dance();
}
interface F{
	void siva();
}
interface D extends C,A,F{
	void dance();
}
public class ExtendsMoreInterfaces implements D {

	

	@Override
	public void display() {
		System.out.println("kk");
	}

	@Override
	public void dance() {
		System.out.println("dance");
	}
	

	@Override
	public void siva() {
		System.out.println("bad");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExtendsMoreInterfaces e=new ExtendsMoreInterfaces();
e.dance();
e.display();
e.siva();
	}

}
