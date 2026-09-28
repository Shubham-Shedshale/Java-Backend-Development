package com.jspiders.interfaces;

public class Bike implements Vehicle
{
  @Override
  public void start()
  {
		System.out.println("Bike Starts....");

  }
  @Override
  public void stop()
  {
		System.out.println("Bike Stops....");

  }
}
