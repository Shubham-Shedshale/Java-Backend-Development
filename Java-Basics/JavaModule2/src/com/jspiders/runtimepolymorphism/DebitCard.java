package com.jspiders.runtimepolymorphism;

public class DebitCard extends Card 
{
   @Override
   void swipe()
   {
	   System.out.println("Balance reduces");

   }
}
