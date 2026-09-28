package com.jspiders.hasa;

class Alpha
{
	void play()
	{
		System.out.println("Playing....");
	}
}
class Beta
{
	Alpha a;
	Beta(Alpha a)
	{
		this.a=a;
	}
}

public class Mainclass2 
{
	public static void main(String[] args)
	{
		Alpha ref=new Alpha();
		Beta b=new Beta(ref);
		b.a.play();
	}

}
