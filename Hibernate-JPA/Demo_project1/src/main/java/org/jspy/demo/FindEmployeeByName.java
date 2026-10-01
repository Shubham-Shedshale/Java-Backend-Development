package org.jspy.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindEmployeeByName 
{
   public static void main(String[] args) {
	   Configuration conf=new Configuration();
	     conf.configure();
	     
	     SessionFactory sef=conf.buildSessionFactory();
	     Session ses=sef.openSession();
	     
	     Query<Employee> q=ses.createQuery("select e from Employee e where e.name=?1");
	     System.out.println("Enter the name");
	     q.setParameter(1,new Scanner(System.in).next());
	     
	     List<Employee> el=q.getResultList();
	     
	     Iterator<Employee> i=el.iterator();
	     while(i.hasNext())
	     {
	    	 Employee e=i.next();
	    	 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
	     }
}
}
