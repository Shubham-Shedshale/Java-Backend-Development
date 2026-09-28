package com.jspiders.methodoverloading;

class Demo
{
	void test(int a)
	{
		System.out.println("white box testing");
	}
	
	void test(double b)
	{
		System.out.println("Black box testing");

	}
	
	void test(String s)
	{
		System.out.println("Grey box testing");

	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.test(20);
		d.test(2.55);
		//d.test("abcd");
	}

}
