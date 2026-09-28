package com.jspiders.methodoverriding;

class Parent
{
	void watchTv()
	{
		System.out.println("news/serial");

	}
	
}

class Child extends Parent
{
	@Override
	void watchTv()
	{
		System.out.println("shows/sports");

	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Parent ref=new Child();
		ref.watchTv();
	}

}
