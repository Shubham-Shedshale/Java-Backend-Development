package com.jspy.userProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser 
{
	public static void main(String[] args) {
		Configuration conf =new Configuration();
		   conf.configure();
		   
		   SessionFactory sef=conf.buildSessionFactory();
		   
		   Session ses=sef.openSession();
				   
		  Transaction tran=ses.getTransaction();
		  
		  tran.begin();
		  User u1=new User();
		  u1.setName("Aditya");
		  u1.setEmail("aditya@email.com");
		  u1.setPassword("adi");
		  u1.setPhone("8887774443");
		  ses.save(u1);
		  tran.commit();
		  
		  tran.begin();
		  User u2=new User();
		  u2.setName("Abhishek");
		  u2.setEmail("abhishek@email.com");
		  u2.setPassword("abhishek");
		  u2.setPhone("9997775553");
		  ses.save(u2);
		  tran.commit();
		  
		  tran.begin();
		  User u3=new User();
		  u3.setName("Farukh");
		  u3.setEmail("farukh@email.com");
		  u3.setPassword("farukh");
		  u3.setPhone("9897755443");
		  ses.save(u3);
		  tran.commit();
		  
		  tran.begin();
		  User u4=new User();
		  u4.setName("Shreyank");
		  u4.setEmail("shreyank@email.com");
		  u4.setPassword("shreyank");
		  u4.setPhone("7777774443");
		  ses.save(u4);
		  tran.commit();
		  
		  tran.begin();
		  User u5=new User();
		  u5.setName("Vrushab");
		  u5.setEmail("vrushab@email.com");
		  u5.setPassword("vrushab");
		  u5.setPhone("6667774443");
		  ses.save(u5);
		  tran.commit();
		  
		  
	}

}
