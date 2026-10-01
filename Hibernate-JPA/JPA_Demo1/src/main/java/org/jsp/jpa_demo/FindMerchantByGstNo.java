package org.jsp.jpa_demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByGstNo {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createNamedQuery("FindMerchantByGstNo");
		System.out.println("Enter the gst number");
		q.setParameter(1, new Scanner(System.in).next());
		
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
