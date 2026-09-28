package com.jspiders.passingandreturningobj;

import java.util.Scanner;

public class Bank 
{
	static void showAccountDetails(Account a)
	{
		if(a!=null)
		{
			System.out.println("Account Number: "+a.accountNumber);
			System.out.println("Account Number: "+a.accountBalance);
		}
	}
	
	static Account createAccount()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Account Number");
		long accountNumber=scn.nextLong();
		System.out.println("Enter Account Balance");
		double accountBalance=scn.nextDouble();
		
		return new Account(accountNumber, accountBalance);
	}

}
