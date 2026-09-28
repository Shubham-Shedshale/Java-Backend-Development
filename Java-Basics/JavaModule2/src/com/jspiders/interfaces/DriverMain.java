package com.jspiders.interfaces;

public class DriverMain 
{
   public static void main(String[] args) {
	OracleDriver od=new OracleDriver();
	DriverManager.registerDriver(od);
	
	MicrosoftDriver md=new MicrosoftDriver();
	DriverManager.registerDriver(md);
	
	IbmDriver id=new IbmDriver();
	DriverManager.registerDriver(id);
}
}
