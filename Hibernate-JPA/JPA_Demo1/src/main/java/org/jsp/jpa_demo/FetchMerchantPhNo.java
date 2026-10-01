package org.jsp.jpa_demo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchMerchantPhNo 
{
    public static void main(String[] args) {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select m from Merchant m");
		
		List<Merchant> ml=q.getResultList();
		
		if(ml.isEmpty())
		{
		System.out.println("No result found");
		}
		else
		{
			for(Merchant m:ml)
			{
				System.out.println(m.getPhone());
			}
		}
	}
}
