package com.jspiders.methodoverriding;


class Whatsapp1
{
	void delivaryReport()
	{
		System.out.println("sent");

	}
}

class Whatsapp2 extends Whatsapp1
{
	@Override
	void delivaryReport()
	{
		System.out.println("sent-deliver");

	}

}

class Whatsapp3 extends Whatsapp2
{
	@Override
	void delivaryReport()
	{
		System.out.println("sent-deliver-seen");

	}

}
public class Whatsapp {
	public static void main(String[] args) {
		Whatsapp1 w1=new Whatsapp2();
		w1.delivaryReport();
		
		Whatsapp1 w2=new Whatsapp3();
		w2.delivaryReport();
	}

}
