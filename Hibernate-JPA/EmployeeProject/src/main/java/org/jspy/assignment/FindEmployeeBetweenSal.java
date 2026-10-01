package org.jspy.assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindEmployeeBetweenSal {

	 public static void main(String[] args) {
			Configuration conf=new Configuration();
			conf.configure();
			SessionFactory sef=conf.buildSessionFactory();
			Session ses=sef.openSession();
			
			Query<Employee> q=ses.createQuery("select e from Employee e where e.salary between ?1 and ?2");
			
			System.out.println("Enter the Minumun salary");
			q.setParameter(1,new Scanner(System.in).nextDouble());
			
			System.out.println("Enter the Maximum salary");
			q.setParameter(2,new Scanner(System.in).nextDouble());
			
			List<Employee> el=q.getResultList();
			
			Iterator<Employee> i=el.iterator();
			
			if(el.isEmpty())
			{
				System.out.println("No record for this range");
			}
			else
			{
				for(Employee e:el)
				{
					System.out.println(e);
				}
			}
		}
}
