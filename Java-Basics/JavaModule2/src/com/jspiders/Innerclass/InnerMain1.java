package com.jspiders.Innerclass;

class Demo
{
	static class Sample
	{
		void test()
		{
			System.out.println("Testing....");

		}
	}
}

public class InnerMain1 
{
	public static void main(String[] args) {
		Demo.Sample ref=new Demo.Sample();
		ref.test();
	}

}
