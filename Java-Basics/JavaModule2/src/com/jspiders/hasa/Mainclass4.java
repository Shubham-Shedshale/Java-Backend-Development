package com.jspiders.hasa;

class Camera
{
	void takePhoto()
	{
		System.out.println("Clicking pic");

	}
}

class SimCard
{
	void network()
	{
		System.out.println("Good Network");

	}
}

class Mobile
{
	Camera cam=new Camera();
	SimCard sim;
	
	Mobile(SimCard sim)
	{
		this.sim=sim;
	}
}

public class Mainclass4 {
	
	public static void main(String[] args) {
		SimCard sim=new SimCard();
		Mobile m=new Mobile(sim);
		m.sim.network();
		m.cam.takePhoto();
	}

}
