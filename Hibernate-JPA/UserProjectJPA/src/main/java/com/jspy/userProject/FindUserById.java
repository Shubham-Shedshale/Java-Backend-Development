package com.jspy.userProject;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class FindUserById 
{
   public static void main(String[] args) {
	   Configuration conf=new Configuration();
	     conf.configure();
	     
	     SessionFactory sef=conf.buildSessionFactory();
	     Session ses=sef.openSession();
	     
	     Transaction tran=ses.getTransaction();
	     
	     
		   System.out.println("Enter the primary key");
		   User u=ses.get(User.class, new Scanner(System.in).nextInt());
		   
		   System.out.println(u);  
		   System.out.println(u.getId());
		   System.out.println(u.getName());
		   System.out.println(u.getEmail());
		   System.out.println(u.getPassword());
		   System.out.println(u.getPhone());

	     
	     
}
}
