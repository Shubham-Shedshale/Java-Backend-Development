package com.jspiders.constructors;

class Developer
{
	Developer(int a,String b)
	{
		System.out.println("Java Developer");
	}
	Developer(String b,int a)
	{
		System.out.println("Pythom Developer");
	}
}

public class Mainclass3 
{
    public static void main(String[] args) {
		Developer d1=new Developer(10,"abcd");
		Developer d2=new Developer("abcd",10);
	}
}
