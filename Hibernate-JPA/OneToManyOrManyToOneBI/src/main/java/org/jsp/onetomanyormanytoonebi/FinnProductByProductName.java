package org.jsp.onetomanyormanytoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FinnProductByProductName {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();

		Query q = em.createQuery("select p from Product p where p.name=?1");
		System.out.println("Enter the product name:");

		q.setParameter(1,new Scanner(System.in).next());
		
		try {
        Product p=(Product) q.getSingleResult();
        System.out.println(p);
		}
		catch(NoResultException e)
		{
			System.out.println("No record found");
		}
		
	}


}
