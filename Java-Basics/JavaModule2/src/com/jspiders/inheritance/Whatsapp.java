package com.jspiders.inheritance;

class Whatsapp1
{
	void messege()
	{
		System.out.println("Messege in whatsapp...");
	}
}

class Whatsapp2 extends Whatsapp1
{
	void status()
	{
		System.out.println("post status in whatsapp");

	}
	void call()
	{
		System.out.println("call in whatsapp");

	}
}

class Whatsapp3 extends Whatsapp2
{
	void payment()
	{
		System.out.println("Payment in whatsapp");

	}
}

public class Whatsapp {
	public static void main(String[] args)
	{
		Whatsapp3 wt=new Whatsapp3();
		wt.messege();
		wt.status();
		wt.call();
		wt.payment();
	}

}
