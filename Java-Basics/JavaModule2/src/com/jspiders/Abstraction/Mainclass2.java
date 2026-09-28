package com.jspiders.Abstraction;

abstract class Alpha
{
	abstract void play();
	void help()
	{
		System.out.println("Helping...");
	}
}

class Beta extends Alpha
{
	@Override
	void play()
	{
		System.out.println("Playing....");
	}
}
public class Mainclass2 
{
	public static void main(String[] args) {
		
	
	Alpha a=new Beta();
	a.play();
	a.help();

}
}