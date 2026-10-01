package org.jsp.jpa_demo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FindMerchantByName {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("Enter the name");
		Query q=em.createQuery("select m from Merchant m where m.name=?1");
		q.setParameter(1, new Scanner(System.in).next());
		
		List<Merchant> ml=q.getResultList();
		if(ml.isEmpty())
		{
			System.out.println("No record found");
		}
		else
		{
			for(Merchant m:ml)
			{
				System.out.println(m);
			}
		}
		
		
		
	}

}
