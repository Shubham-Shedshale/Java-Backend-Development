package org.jsp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudent 
{
   public static void main(String[] args) {
	
	   Configuration conf =new Configuration();
	   conf.configure();
	   
	   SessionFactory sef=conf.buildSessionFactory();
	   
	   Session ses=sef.openSession();
			   
	  Transaction tran=ses.getTransaction();
	  
//	  tran.begin();
//	  Student s1=new Student();
//	  s1.setName("Rohit");
//	  s1.setMarks(80);
//	  ses.save(s1);
//	  tran.commit();
//	  
//	  tran.begin();
//	  Student s2=new Student();
//	  s2.setName("Virat");
//	  s2.setMarks(85);
//	  ses.save(s2);
//	  tran.commit();
//	  
//	  tran.begin();
//	  Student s3=new Student();
//	  s3.setName("Rahul");
//	  s3.setMarks(90);
//	  ses.save(s3);
//	  tran.commit();
//	  
//	  tran.begin();
//	  Student s4=new Student();
//	  s4.setName("Jasprit");
//	  s4.setMarks(95);
//	  ses.save(s4);
//	  tran.commit();
//	  
//	  tran.begin();
//	  Student s5=new Student();
//	  s5.setName("Vaibhav");
//	  s5.setMarks(92);
//	  ses.save(s5);
//	  tran.commit();
	  
	  tran.begin();
	  Student s6=new Student();
	  s6.setName("Dhoni");
	  s6.setMarks(85);
	  ses.save(s6);
	  tran.commit();
}
}
