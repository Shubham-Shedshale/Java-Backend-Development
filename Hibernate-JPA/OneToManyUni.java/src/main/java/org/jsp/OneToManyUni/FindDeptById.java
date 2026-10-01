package org.jsp.OneToManyUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindDeptById {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToManyUni");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("Enter the Dept id:");
		Dept d=em.find(Dept.class,new Scanner(System.in).nextInt());
		
		if(d!=null) {
			System.out.println(d);
		}
		else
		{
			System.out.println("Record not found");
		}
	}

}
