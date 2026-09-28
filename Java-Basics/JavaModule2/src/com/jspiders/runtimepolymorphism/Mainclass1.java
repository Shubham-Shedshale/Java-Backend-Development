package com.jspiders.runtimepolymorphism;

public class Mainclass1 
{
    public static void main(String[] args) {
		DebitCard dc=new DebitCard();
		Shop.payment(dc);
		CreditCard cd=new CreditCard();
		Shop.payment(cd);
	}
}
