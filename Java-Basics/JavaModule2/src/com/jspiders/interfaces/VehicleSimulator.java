package com.jspiders.interfaces;

public class VehicleSimulator 
{
   static void driveVehicle(Vehicle v)
   {
	   if(v!=null)
	   {
		   v.start();
		   v.stop();
	   }
   }
}
