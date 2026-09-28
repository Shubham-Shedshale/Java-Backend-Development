package com.jspiders.interfaces;

public class VehicleMain 
{
  public static void main(String[] args) {
	Bike b=new Bike();
	VehicleSimulator.driveVehicle(b);
	
	Car c=new Car();
	VehicleSimulator.driveVehicle(c);
}
}
