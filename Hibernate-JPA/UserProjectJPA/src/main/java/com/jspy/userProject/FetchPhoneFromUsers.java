package com.jspy.userProject;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class FetchPhoneFromUsers
{
     public static void main(String[] args) {
    	 Configuration conf=new Configuration();
 	    conf.configure();
 	    
 	    SessionFactory sef=conf.buildSessionFactory();
 	    Session ses=sef.openSession();
 	    
 	    Query<User> q=ses.createQuery("select u from User u");
 	    
 	    List<User> li=q.getResultList();
 	    
 	    Iterator<User> i=li.iterator();
 	    
 	    while(i.hasNext())
 	    {
 	    	User u=i.next();
 	    	System.out.println(u.getPhone());
 	    }
	}
}
