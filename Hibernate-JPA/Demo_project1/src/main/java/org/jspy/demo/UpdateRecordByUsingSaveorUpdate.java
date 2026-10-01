package org.jspy.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecordByUsingSaveorUpdate {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
	     conf.configure();
	     
	     SessionFactory sef=conf.buildSessionFactory();
	     Session ses=sef.openSession();
	     
	     Transaction tran=ses.getTransaction();
	     
	     tran.begin();
	     Employee e=new Employee();
	     e.setId(3);
	     e.setName("Chandan");
	     e.setSalary(30000);
	     ses.saveOrUpdate(e);
	     tran.commit();
	     
	     tran.begin();
	     Employee e1=new Employee();
	     e1.setId(4);
	     e1.setName("D");
	     e1.setSalary(50000);
	     ses.saveOrUpdate(e1);  
	     tran.commit();
	}

}
