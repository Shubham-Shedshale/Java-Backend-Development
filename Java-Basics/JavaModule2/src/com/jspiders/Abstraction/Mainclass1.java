package com.jspiders.Abstraction;

abstract class Demo
{
	abstract void test();
	abstract void disp();
}

class Sample extends Demo
{
	@Override
	void test()
	{
		System.out.println("Testing()....");
	}
	@Override
	void disp()
	{
		System.out.println("Displaying....");
	}
}

public class Mainclass1 
{
   public static void main(String[] args) {
	Demo d=new Sample();
	d.test();
	d.disp();
}
}
