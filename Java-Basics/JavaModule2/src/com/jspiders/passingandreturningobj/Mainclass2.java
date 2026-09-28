package com.jspiders.passingandreturningobj;

public class Mainclass2 {
	
	public static void main(String[] args)
	{
		Account a1=Bank.createAccount();
		Bank.showAccountDetails(a1);
		
		Account a2=Bank.createAccount();
		Bank.showAccountDetails(a2);
		
		Account a3=Bank.createAccount();
		Bank.showAccountDetails(a3);
		
		
		
	}

}
