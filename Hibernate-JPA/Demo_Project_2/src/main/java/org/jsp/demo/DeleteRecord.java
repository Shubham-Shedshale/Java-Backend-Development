package org.jsp.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord
{
   public static void main(String[] args) {
	   
	   Configuration conf=new Configuration();
	   conf.configure();
	   SessionFactory sef=conf.buildSessionFactory();
	   Session ses=sef.openSession();
	   
	   Transaction tran=ses.getTransaction();
	   
	   
	   tran.begin();
	   System.out.println("Enter the primary key1");
	   Student s=ses.get(Student.class, new Scanner(System.in).nextInt());
	   
	   if(s!=null)
	   {
		   ses.delete(s);
		   tran.commit();
	   }
	   else
	   {
		   System.out.println("Object not found");
	   }
	
   }
}
