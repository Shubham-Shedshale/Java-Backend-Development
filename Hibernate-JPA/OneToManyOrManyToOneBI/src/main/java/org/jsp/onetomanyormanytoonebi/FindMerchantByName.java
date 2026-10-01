package org.jsp.onetomanyormanytoonebi;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByName {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		
		Query q=em.createQuery("select m from Merchant m where m.name=?1");
		System.out.println("Enter the name of the merchant:");
		q.setParameter(1, new Scanner(System.in).next());
		
		try {
		Merchant m=(Merchant) q.getSingleResult();
		System.out.println(m);
	   }
        
		catch(NoResultException e)
		{
			System.out.println("Not found");
		}
	}
}
