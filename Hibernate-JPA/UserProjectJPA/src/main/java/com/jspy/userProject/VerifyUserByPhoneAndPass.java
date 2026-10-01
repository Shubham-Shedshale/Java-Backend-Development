package com.jspy.userProject;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyUserByPhoneAndPass 
{
    public static void main(String[] args) {
    	 Configuration conf=new Configuration();
	     conf.configure();
	     
	     SessionFactory sef=conf.buildSessionFactory();
	     Session ses=sef.openSession();
	     
	     
	     Query<User> q=ses.createQuery("select u from User u where u.phone=?1 and u.password=?2");
	     System.out.println("Enter phone");
	     q.setParameter(1, new Scanner(System.in).next());
	     
	     System.out.println("Enter password");
	     q.setParameter(2, new Scanner(System.in).next());
	     
	      try {
	       User u=q.getSingleResult();
	       System.out.println("Login Succesfull");
	      }
	      catch(NoResultException e)
	      {
	    	  System.out.println("Incorrect ph or pass");
	      }
	      
	     
	}
}
