package org.jsp.onetomanyormanytoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByProductId {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();

		Query q = em.createQuery("select p.m from Product p where p.id=?1");
		System.out.println("Enter the product id:");

		q.setParameter(1,new Scanner(System.in).nextInt());
		
		try {
        Merchant m=(Merchant) q.getSingleResult();
        System.out.println(m);
		}
		catch(NoResultException e)
		{
			System.out.println("No record found");
		}
		
	}



}
