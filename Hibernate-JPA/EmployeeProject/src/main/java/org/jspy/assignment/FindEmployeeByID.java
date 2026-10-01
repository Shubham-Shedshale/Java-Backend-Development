package org.jspy.assignment;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FindEmployeeByID 
{
	public static void main(String[] args) {
		
	Configuration conf=new Configuration();
	conf.configure();
	SessionFactory sf=conf.buildSessionFactory();
	Session ses=sf.openSession();
    //Transaction tran=ses.getTransaction();
    
   // tran.begin();
    System.err.println("Enter the primary key");
    
	Employee e=ses.get(Employee.class,new Scanner(System.in).nextInt());
    
//    if(e!=null)
//    {
    	System.out.println(e);
//    	e.getId();
//    	e.getName();
//    	e.getPhone();
//    	e.getEmail();
//    	e.getPassword();
//    	e.getDesignation();
//    	e.getSalary();
  //  	tran.commit();
    	
//    }
//    else
//    {
//    	System.out.println("Object not found");
//    }
}
}
