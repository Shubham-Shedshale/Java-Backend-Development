package com.jspy.userProject;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class FindUserByName {
	public static void main(String[] args) {
	Configuration conf=new Configuration();
    conf.configure();
    
    SessionFactory sef=conf.buildSessionFactory();
    Session ses=sef.openSession();
    
    Query<User> q=ses.createQuery("select u from User u where u.name=?1");
    
    System.out.println("Enter the name");
    q.setParameter(1, new Scanner(System.in).next());
    
    List<User> li=q.getResultList();
    
    if(li.isEmpty())
    {
    	System.out.println("Result not found");
    }
    else
    {
    	for(User u:li)
    	{
    		System.out.println(u);
    	}
    }

    }
}
