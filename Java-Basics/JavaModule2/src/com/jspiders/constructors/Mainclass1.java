package com.jspiders.constructors;

class Hotel
{
	Hotel(int a)
	{
		System.out.println("McDonalds");
	}
	Hotel(double b)
	{
		System.out.println("KFC");
	}
	Hotel(String s)
	{
		System.out.println("Dominos");
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Hotel h1=new Hotel(10);
		Hotel h2=new Hotel(5.5);
		Hotel h3=new Hotel("ABC");
	}

}
