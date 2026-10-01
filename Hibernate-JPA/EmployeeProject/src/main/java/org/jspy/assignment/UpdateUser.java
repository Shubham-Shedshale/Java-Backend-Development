package org.jspy.assignment;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser 
{
	
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session ses=sf.openSession();
	    Transaction tran=ses.getTransaction();
	    
	    tran.begin();
	    System.err.println("Enter the primary key");
	    
		Employee e=ses.get(Employee.class,new Scanner(System.in).nextInt());
	    
	    if(e!=null)
	    {
	    	e.setName("Vaibhav S");
	    	e.setEmail("vaibhav@gmail.com");
	    	e.setPhone("6778956478");
	    	e.setPassword("vaibhavv");
	    	e.setDesignation("frontend developer");
	    	e.setSalary(25000);
	    	tran.commit();
	    }
	    else
	    {
	    	System.out.println("User not found");
	    }
	}
}
