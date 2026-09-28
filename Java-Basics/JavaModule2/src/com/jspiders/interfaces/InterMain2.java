package com.jspiders.interfaces;

interface Alpha1
{
    void test();	
}

interface Beta1
{
	void disp();
}

class Gamma implements Alpha1,Beta1
{
	@Override
	public void test()
	{
		System.out.println("Testing(),....");

	}
	@Override
	public void disp()
	{
		System.out.println("Displaying.....");

	}
}

public class InterMain2 {
	
	public static void main(String[] args) {
		Gamma ref=new Gamma();
		ref.test();
		ref.disp();
	}

}
