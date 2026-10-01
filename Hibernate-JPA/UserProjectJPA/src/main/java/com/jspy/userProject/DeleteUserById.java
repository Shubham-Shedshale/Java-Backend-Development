package com.jspy.userProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteUserById 
{
   public static void main(String[] args) {
	   Configuration conf=new Configuration();
	     conf.configure();
	     
	     SessionFactory sef=conf.buildSessionFactory();
	     Session ses=sef.openSession();
	     
	     Transaction tran=ses.getTransaction();
	     tran.begin();
	     
	     System.out.println("Enter the id");
	     
	     User u=ses.get(User.class, new Scanner(System.in).nextInt());
	     
	     if(u!=null)
	     {
	    	 ses.delete(u);
	    	 tran.commit();
	     }
	     else
	     {
	    	 System.out.println("id not found");
	     }
}
}
