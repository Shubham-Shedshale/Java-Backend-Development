package org.jspy.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee
{
	public static void main(String[] args) {
	     Configuration conf=new Configuration();
	     conf.configure();
	     
	     SessionFactory sef=conf.buildSessionFactory();
	     Session ses=sef.openSession();
	     
	     Transaction tran=ses.getTransaction();
	     tran.begin();
//	     Employee e=new Employee();
//	     e.setName("A");
//	     e.setSalary(40000);
//	     ses.save(e);
//	     tran.commit();
//	     
	     tran.begin();
	     Employee e2=new Employee();
	     e2.setName("B");
	     e2.setSalary(45000);
	     ses.save(e2);
	     tran.commit();
	     
	     tran.begin();
	     Employee e3=new Employee();
	     e3.setName("C");
	     e3.setSalary(50000);
	     ses.save(e3);
	     tran.commit();
	     
	     
	}

}
