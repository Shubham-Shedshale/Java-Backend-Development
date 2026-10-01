package org.jsp.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.jspy.demo.Employee;

public class ReadRecordByGet
{
    public static void main(String[] args) {
       Configuration conf =new Configuration();
  	   conf.configure();
  	   
  	   SessionFactory sef=conf.buildSessionFactory();
  	   
  	   Session ses=sef.openSession();
  	   System.out.println("Enter the primary key");
	   Student s=ses.get(Student.class, new Scanner(System.in).nextInt());
	   
	   System.out.println(s);
	   System.out.println(s.getId());
	   System.out.println(s.getMarks());
	   System.out.println(s.getName());
	}
}
