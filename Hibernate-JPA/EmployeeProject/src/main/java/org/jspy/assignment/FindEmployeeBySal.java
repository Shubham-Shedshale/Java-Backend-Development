package org.jspy.assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class FindEmployeeBySal
{
    public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		
		Query<Employee> q=ses.createQuery("select e from Employee e where e.salary=?1");
		
		System.out.println("Enter the salary");
		q.setParameter(1,new Scanner(System.in).nextDouble());
		
//		System.out.println("Enter the Maximum salary");
//		q.setParameter(2,new Scanner(System.in).nextDouble());
//		
		List<Employee> el=q.getResultList();
		
		Iterator<Employee> i=el.iterator();
		
		while(i.hasNext())
		{
			Employee e=i.next();
			System.out.println(e);
		}
	}
}
