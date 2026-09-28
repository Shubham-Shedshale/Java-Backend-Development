package com.jspiders.runtimepolymorphism;

public class Mainclass3 
{
     public static void main(String[] args) {
		PetrolCar pc =new PetrolCar();
		FuelStation.addFuel(pc);
		
		DieselCar dc =new DieselCar();
		FuelStation.addFuel(dc);
	}
}
