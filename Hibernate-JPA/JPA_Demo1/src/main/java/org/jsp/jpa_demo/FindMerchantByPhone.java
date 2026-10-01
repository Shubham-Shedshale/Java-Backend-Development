package org.jsp.jpa_demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByPhone {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createNamedQuery("FindMerchantByPhone");
		System.out.println("Enter the phone number");
		q.setParameter(1, new Scanner(System.in).nextLong());
		
		try
		{
			Merchant m=(Merchant) q.getSingleResult();
			System.out.println(m);
		}
		catch(NoResultException e)
		{
			System.out.println("No record found");
		}
	}


}
