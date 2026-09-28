package com.jspiders.inheritance;


class A
{
	int x=30;
	void test()
	{
		System.out.println("Executing test().....");
	}
}

class B extends A
{
	
}

public class Mainclass1 {
	
	public static void main(String[] args)
	{
	
	B ref=new B();
	System.out.println(ref.x);
	ref.test();

}
}
