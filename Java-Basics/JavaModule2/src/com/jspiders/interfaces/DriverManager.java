package com.jspiders.interfaces;

public class DriverManager 
{
   static void registerDriver(Driver d)
   {
	   if(d!=null)
	   {
		   d.read();
	   }
   }
}
