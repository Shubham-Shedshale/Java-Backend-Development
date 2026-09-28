package com.jspiders.constructors;

class Iphone17
{
	Iphone17()
	{
		System.out.println("Iphone 17");
	}
	Iphone17(int a)
	{
		System.out.println("Iphone 17 pro");
	}
	Iphone17(int a,int b)
	{
		System.out.println("Iphone 17 pro max");
	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		Iphone17 i1=new Iphone17();
		Iphone17 i2=new Iphone17(30);
		Iphone17 i3=new Iphone17(10,20);
	}

}
