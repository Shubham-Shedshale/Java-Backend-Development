package org.jspy.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecordByFetchandUpdate {
	
	public static void main(String[] args) {
		 Configuration conf=new Configuration();
	     conf.configure();
	     
	     SessionFactory sef=conf.buildSessionFactory();
	     Session ses=sef.openSession();
	     
	     Transaction tran=ses.getTransaction();
	     
	       tran.begin();  
		   System.out.println("Enter the primary key");
		   Employee e=ses.get(Employee.class, new Scanner(System.in).nextInt());
		   
		   if(e!=null)
		   {
			   e.setName("Bharatha");
			   tran.commit();
		   }
		   else
		   {
			   System.out.println("Object Not Found");
		   }
		   
	}

}
