package org.jspy.assignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmp
{
   public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure();
	SessionFactory sf=conf.buildSessionFactory();
	Session ses=sf.openSession();
    Transaction tran=ses.getTransaction();
	
	tran.begin();
	Employee e1=new Employee();
	e1.setName("Virat");
	e1.setPhone("8776548920");
	e1.setEmail("virat@gmail.com");
	e1.setPassword("viratt");
	e1.setDesignation("java developer");
	e1.setSalary(50000);
	ses.save(e1);
	tran.commit();
	
	tran.begin();
	Employee e2=new Employee();
	e2.setName("Rohit");
	e2.setPhone("9996548924");
	e2.setEmail("rohitt@gmail.com");
	e2.setPassword("rohitt");
	e2.setDesignation("python developer");
	e2.setSalary(40000);
	ses.save(e2);
	tran.commit();
	
	tran.begin();
	Employee e3=new Employee();
	e3.setName("Dhoni");
	e3.setPhone("7776512329");
	e3.setEmail("dhoni@gmail.com");
	e3.setPassword("dhonii");
	e3.setDesignation("mern developer");
	e3.setSalary(30000);
	ses.save(e3);
	tran.commit();
	
	tran.begin();
	Employee e4=new Employee();
	e4.setName("Rahul");
	e4.setPhone("9912338921");
	e4.setEmail("rahul@gmail.com");
	e4.setPassword("rahull");
	e4.setDesignation("web developer");
	e4.setSalary(45000);
	ses.save(e4);
	tran.commit();
	
	tran.begin();
	Employee e5=new Employee();
	e5.setName("Shubman");
	e5.setPhone("9887774892");
	e5.setEmail("shubman@gmail.com");
	e5.setPassword("shubmann");
	e5.setDesignation("java developer");
	e5.setSalary(30000);
	ses.save(e5);
	tran.commit();
	
	tran.begin();
	Employee e6=new Employee();
	e6.setName("Vaibhav");
	e6.setPhone("7896540892");
	e6.setEmail("vaibhav@gmail.com");
	e6.setPassword("vaibhavv");
	e6.setDesignation("Frontend developer");
	e6.setSalary(25000);
	ses.save(e6);
	tran.commit();
}
}
