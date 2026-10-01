package org.jsp.manytomanyuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBatchById {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("Enter the batch id:");
		
		Batch b=em.find(Batch.class, new Scanner(System.in).nextInt());
		
		if(b!=null)
		{
			System.out.println(b);
			
		}
		else
		{
			System.out.println("Record not found");
		}
	}
}
