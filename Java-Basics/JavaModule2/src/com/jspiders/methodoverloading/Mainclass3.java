package com.jspiders.methodoverloading;
class SoftwareEngineer
{
	void work(int a,String s)
	{
		System.out.println("Development");
	}
	void work(String s,int a)
	{
		System.out.println("Testing");

	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		SoftwareEngineer sw=new SoftwareEngineer();
		sw.work(10, "abc");
		sw.work("abc",10);
	}

}
