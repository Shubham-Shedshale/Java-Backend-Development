package com.jspiders.compiletimepolymorphism;

class Flipkart
{
	void payment()
	{
		System.out.println("COD");
	}
	
	void payment(Long card)
	{
		System.out.println("CARD=no cost EMI");

	}
	
	void payment(String upi)
	{
		System.out.println("UPI: 15% cashback");
	}
}

public class Mainclass1 
{
    public static void main(String[] args) {
		Flipkart f=new Flipkart();
		f.payment();
		f.payment(8476437373883L);
		f.payment("Google pay");
	}
}
