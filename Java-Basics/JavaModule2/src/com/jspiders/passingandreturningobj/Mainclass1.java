package com.jspiders.passingandreturningobj;

public class Mainclass1 {
	public static void main(String[] args)
	{
		Employee e1=EmployeeHelper.createEmployee();
		EmployeeHelper.displayEmployeeInfo(e1);
		
		Employee e2=EmployeeHelper.createEmployee();
		EmployeeHelper.displayEmployeeInfo(e2);
		
		Employee e3=EmployeeHelper.createEmployee();
		EmployeeHelper.displayEmployeeInfo(e3);
		
		
	}

}
