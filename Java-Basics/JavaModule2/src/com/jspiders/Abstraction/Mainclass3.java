package com.jspiders.Abstraction;

abstract class Delta
{
	void ride()
	{
		System.out.println("riding.....");
	}
	void drive()
	{
		System.out.println("driving.....");
	}
}

class Example extends Delta
{
	
}

public class Mainclass3 {
	public static void main(String[] args) {
		Delta ref=new Example();
		ref.drive();
		ref.ride();
	}

}
