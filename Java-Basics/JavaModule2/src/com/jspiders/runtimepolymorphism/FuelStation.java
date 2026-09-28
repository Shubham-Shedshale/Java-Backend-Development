package com.jspiders.runtimepolymorphism;

public class FuelStation 
{
    static void addFuel(Car c)
    {
    	if(c!=null)
    	{
    		c.fuel();
    	}
    }
}
