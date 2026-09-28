package com.jspiders.methodoverriding;

class Demo
{
	void test()
	{
		System.out.println("Manual Testing");
	}
}
class Sample extends Demo
{
	@Override
	void test()
	{
		System.out.println("Automation Testing");

	}
}

public class Mainclass {
	public static void main(String[] args) {
		Demo ref=new Demo();
		ref.test();
		
		Sample s=new Sample();
		s.test();
		
	}

}
