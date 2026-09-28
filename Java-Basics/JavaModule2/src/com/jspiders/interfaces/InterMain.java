package com.jspiders.interfaces;

interface Beta
{
	void play();
	void disp();
}

class Alpha implements Beta
{
	@Override
	public void play()
	{
		System.out.println("Playing()....");
	}
	@Override
	public void disp()
	{
		System.out.println("Displaying");
	}
}
public class InterMain
{
   public static void main(String[] args) {
	Beta ref=new Alpha();
	ref.play();
	ref.disp();
}
}
