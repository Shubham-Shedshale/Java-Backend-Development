package com.jspiders.passingandreturningobj;

import java.util.Scanner;

public class EmployeeHelper 
{
	static void displayEmployeeInfo(Employee e)
	{
		if(e!=null)
		{
			System.out.println("EID : "+e.eid);
			System.out.println("CTC : "+e.ctc);
		}
	}
	
	static Employee createEmployee()
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter EID");
		int eid=scn.nextInt();
		System.out.println("Enter CTC");
		double ctc=scn.nextDouble();
		
		return new Employee(eid,ctc);
	}

}
