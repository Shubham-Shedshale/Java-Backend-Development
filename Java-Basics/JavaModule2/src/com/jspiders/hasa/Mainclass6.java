package com.jspiders.hasa;

class Printer
{
	void write()
	{
		System.out.println("Writing with printer");

	}
}

class Device
{
	static Printer out=new Printer();
}

public class Mainclass6 
{
   public static void main(String[] args) {
	Device.out.write();
}
}
