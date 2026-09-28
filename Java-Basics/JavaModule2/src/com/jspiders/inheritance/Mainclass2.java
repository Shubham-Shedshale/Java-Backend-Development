package com.jspiders.inheritance;

class Demo
{
	void disp()
	{
		System.out.println("Displaying......");
	}
}

class Sample extends Demo
{
	void play()
	{
		System.out.println("Playing.......");
	}
}


public class Mainclass2 {
	
	public static void main(String[] args)
	{
		Sample s=new Sample();
		s.disp();
		s.play();
		
		Demo d=new Demo();
		d.disp();
		//d.play();         //superclass cannot access properties of subclass
	}

}
