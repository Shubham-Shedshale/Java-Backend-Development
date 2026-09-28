package com.jspiders.beanclass;

public class Sample {
	private Sample()
	{
		
	}
   private static Sample s=new Sample();
   public static Sample getSample()
   {
	   if(s==null)
	   {
		   s=new Sample();
	   }
	   return s;
   }
}
