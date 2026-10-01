package org.jspy.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveDataByGet 
{
   public static void main(String[] args) {
	
	   Configuration conf=new Configuration();
	   conf.configure();
	   
	   SessionFactory sef=conf.buildSessionFactory();
	   
	   Session ses=sef.openSession();
	   
	   
	   System.out.println("Enter the primary key");
	   Employee e=ses.get(Employee.class, new Scanner(System.in).nextInt());
	                                          //  |
	                                     //Best and recommended coz no need to close ref variable and ref var will stay in memory untill we close it
	                                     // and gc will not remove it until we close so it.
	   
	   //if empid=4//nullPointerException
	   
	   System.out.println(e);   // [id=2, name=B, salary=45000.0]-->coz we hv overriden the toString() in Employee class
	   System.out.println(e.getId());
	   System.out.println(e.getName());
	   System.out.println(e.getSalary());

   }
}
