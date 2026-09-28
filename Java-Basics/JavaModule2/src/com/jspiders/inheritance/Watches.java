package com.jspiders.inheritance;

class Watch
{
	void showTime()
	{
		System.out.println("Shows time");

	}
}

class SmartWatch extends Watch
{
	void showNotification()
	{
		System.out.println("Shows Notification");

	}
}
public class Watches {
	public static void main(String[] args)
	{
		SmartWatch sw=new SmartWatch();
		sw.showTime();
		sw.showNotification();
		
	}

}
