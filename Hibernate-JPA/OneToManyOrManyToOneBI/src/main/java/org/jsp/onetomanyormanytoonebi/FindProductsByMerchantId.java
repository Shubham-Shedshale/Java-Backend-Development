package org.jsp.onetomanyormanytoonebi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindProductsByMerchantId {
	
	public static void main(String[] args) {
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	
	Query q=em.createQuery("select m.plist from Merchant m where m.id=?1");
	System.out.println("Enter the Merchant id num:");
	q.setParameter(1, new Scanner(System.in).nextInt());
	
	List<Product> pl=q.getResultList();
	
	if(pl.isEmpty())
	{
		System.out.println("No records found");
	}
	else
	{
		for(Product p: pl)
		{
			System.out.println(p);
		}
	}
	
	}
}
