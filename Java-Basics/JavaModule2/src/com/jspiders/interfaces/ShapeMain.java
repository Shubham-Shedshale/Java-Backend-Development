package com.jspiders.interfaces;

public class ShapeMain 
{
   public static void main(String[] args) 
   {
	  Circle c=new Circle();
	  ShapeToolkit.drawShape(c);
	  
	  Square s=new Square();
	  ShapeToolkit.drawShape(s);
	  
	  Traingle t=new Traingle();
	  ShapeToolkit.drawShape(t);
	  
   }
}
