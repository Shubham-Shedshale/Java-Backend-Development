package com.jspiders.methodoverloading;

class Sample
{

	void play(int a)
	{
		System.out.println("Cricket");
	}
	
	void play(int a,int b)
	{
		System.out.println("Football");

	}
	
	void play(int a,int b,int c)
	{
		System.out.println("Basketball");

	}
}

public class Mainclass2 {
	
	public static void main(String[] args) {
		Sample s=new Sample();
		s.play(10,15);
		s.play(5);
		s.play(1,2,3);
	}

}

