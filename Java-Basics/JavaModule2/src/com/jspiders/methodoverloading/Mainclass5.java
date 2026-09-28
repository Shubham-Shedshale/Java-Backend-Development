package com.jspiders.methodoverloading;

class Flipkart
{
	void payment()
	{
		System.out.println("COD");

	}
	void payment(String upi)
	{
		System.out.println("UPI");

	}
	void payment(long card)
	{
		System.out.println("CARD");

	}
	void payment(String un,String pass)
	{
		System.out.println("Netbanking");

	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		Flipkart fl=new Flipkart();
		fl.payment();
		fl.payment(75648484);
		fl.payment("scott","tiger");
		fl.payment("Googlepay");
	}

}
