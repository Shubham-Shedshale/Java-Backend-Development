package org.jsp.manytomanyuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStudentById {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("Enter the Student id:");
		
		Student s=em.find(Student.class, new Scanner(System.in).nextInt());
		
		if(s!=null)
		{
			System.out.println(s);
			
		}
		else
		{
			System.out.println("Record not found");
		}
	}

}
