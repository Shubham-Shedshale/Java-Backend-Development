package org.jspy.assignment;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyByIdandPass {
	
	public static void main(String[] args) {
	 	   Configuration conf=new Configuration();
	 		conf.configure();
	 		SessionFactory sf=conf.buildSessionFactory();
	 		Session ses=sf.openSession();
	 	   
	 		 Query<Employee> q=ses.createQuery("select e from Employee e where e.id=?1 and e.password=?2");
	 		    
	 		    System.out.println("Enter the id");
	 		    q.setParameter(1, new Scanner(System.in).nextInt());
	 		    System.out.println("Enter the password");
	 		    q.setParameter(2, new Scanner(System.in).next());
	 
	 		    	Employee e=q.uniqueResult();
	 		     
	 		    if(e!=null)
	 		    {
	 		    	System.out.println("Login Successfull");
	 		    }
	 		    else
	 		    {
	 		    	System.out.println("Invalid email or pass");
	 		    }
	 		    
	 		}

}
