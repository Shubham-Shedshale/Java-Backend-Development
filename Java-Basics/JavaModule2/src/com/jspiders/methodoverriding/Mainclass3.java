package com.jspiders.methodoverriding;

class Father
{
	void motorCycle()
	{
		System.out.println("Normal");

	}
}
class Son extends Father
{
	@Override
	void motorCycle()
	{
		System.out.println("Modified");

	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		Father f=new Father();
		f.motorCycle();
		
		Son s=new Son();
		s.motorCycle();
		
		Father ref=new Son();
		ref.motorCycle();
	}
	

}
