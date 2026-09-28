package com.jspiders.passingandreturningobj;

import java.util.Scanner;

public class Cricket
{
    static void displayplayerDetails(Player p)
    {
    	if(p!=null)
    	{
    		System.out.println("Jersey Number="+p.jerseyNumber);
    		System.out.println("Name="+p.name);
    	}
    }
    
    static Player createPlayer()
    {
    
    	Scanner scn=new Scanner(System.in);
    	
    	System.out.println("Enter Jersey Number=");
    	int jerseyNumber=scn.nextInt();
    	
    	System.out.println("Enter name=");
    	String name=scn.next();
    	
    	return new Player(jerseyNumber,name);
    }
}
