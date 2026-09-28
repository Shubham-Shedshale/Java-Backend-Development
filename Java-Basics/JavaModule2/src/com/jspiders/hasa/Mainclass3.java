package com.jspiders.hasa;

class Engine
{
	void power()
	{
		System.out.println("Engine delivers power");
	}
}
class Driver
{
	void drive()
	{
		System.out.println("Driver drives car");

	}
}

class Car
{
	Engine eng=new Engine();
	Driver dr;
	
	Car(Driver dr)
	{
		this.dr=dr;
	}
}

public class Mainclass3
{
    public static void main(String[] args) {
		Driver dr=new Driver();
		Car c=new Car(dr);
		c.eng.power();
		c.dr.drive();
				
	}
}
