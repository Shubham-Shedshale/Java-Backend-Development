package com.jspiders.passingandreturningobj;

public class Mainclass3 {
	
	public static void main(String[] args)
	{
		Player p1=Cricket.createPlayer();
		Cricket.displayplayerDetails(p1);
		
		Player p2=Cricket.createPlayer();
		Cricket.displayplayerDetails(p2);
		
		Player p3=Cricket.createPlayer();
		Cricket.displayplayerDetails(p3);
	}

}
