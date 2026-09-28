package com.jspiders.runtimepolymorphism;

public class CreditCard extends Card 
{
	@Override
    void swipe()
    {
 	   System.out.println("Due Increased..");

    }
}
