package com.jspiders.interfaces;

class A
{
	void start()
	{
		System.out.println("Start() executes....");
	}
}

interface B
{
	void check();
}

class C extends A implements B
{
	@Override
	public void check()
	{
		System.out.println("check() executes....");

	}
}
public class InterMain3 
{
   public static void main(String[] args) {
	C ref=new C();
	ref.start();
	ref.check();
	   
//	   A ref=new A();
//	   ref.start();
//	   
//	   B ref1=new C();
//	   ref1.check();
}
}
