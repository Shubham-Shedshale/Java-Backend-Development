package org.jsp.OneToManyUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEmployeeById {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToManyUni");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("Enter the Employee id:");
		Employee e=em.find(Employee.class,new Scanner(System.in).nextInt());
		
		if(e!=null) {
			System.out.println(e);
		}
		else
		{
			System.out.println("Record not found");
		}
	}


}
