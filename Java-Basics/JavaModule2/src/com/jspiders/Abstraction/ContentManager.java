package com.jspiders.Abstraction;

public class ContentManager 
{
   static void access(Hotstar h)
   {
	   if(h!=null)
	   {
		   h.login();
		   h.watch();
	   }
   }
}
