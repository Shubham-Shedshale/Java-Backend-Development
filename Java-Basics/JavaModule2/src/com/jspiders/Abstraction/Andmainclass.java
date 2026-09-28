package com.jspiders.Abstraction;

public class Andmainclass 
{
   public static void main(String[] args) {
	Samsung s=new Samsung();
	Shop.displayPhone(s);
	
	Vivo v=new Vivo();
	Shop.displayPhone(v);
	
	Oppo o=new Oppo();
	Shop.displayPhone(o);
}
}
