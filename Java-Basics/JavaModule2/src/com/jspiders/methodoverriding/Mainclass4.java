package com.jspiders.methodoverriding;

class Mother
{
	void marriage()
	{
		System.out.println("Arrange marriage");
	}
}

class Daughter extends Mother
{
	@Override
	void marriage()
	{
		System.out.println("Love marriage");
	}
}

public class Mainclass4
{
   public static void main(String[] args) {
	Mother m=new Mother();
	m.marriage();
	
	Daughter d=new Daughter();
	d.marriage();
	
	Mother ref=new Daughter();
	ref.marriage();
	
}
}
