package org.jsp.jpa_demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveRecord {
   public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction etran=em.getTransaction();
	
	etran.begin();
	System.out.println("Enter the id to remove");
	Merchant m=em.find(Merchant.class, new Scanner(System.in).nextInt());
	
	if(m!=null) {
		em.remove(m);
		etran.commit();
	}
	else
	{
		System.out.println("Object not found");
	}
}
}
