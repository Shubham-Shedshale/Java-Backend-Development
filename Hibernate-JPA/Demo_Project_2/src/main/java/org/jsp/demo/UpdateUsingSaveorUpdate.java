package org.jsp.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUsingSaveorUpdate {
	
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		
		Transaction tran=ses.getTransaction();
	
//		System.out.println("Enter the primary key");
//		Student s=ses.saveOrUpdate(Student.class,new Scanner(System.in).nextInt());
		
		tran.begin();
		Student s=new Student();
		s.setId(2);
		s.setMarks(99);
		s.setName("Viart Kohli");
		ses.saveOrUpdate(s);
		tran.commit();
		
		tran.begin();
		Student s1=new Student();
		s1.setId(1);
		s1.setMarks(87);
		s1.setName("Rohit Sharma");
		ses.saveOrUpdate(s1);
		tran.commit();
		
		
		
	}

}
