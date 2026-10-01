package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindUserByAdharId {
	
      public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select card.u from AadharCard card where card.id=?1");

		System.out.println("Enter the Adhar id");
		q.setParameter(1, new Scanner(System.in).nextInt());
		
		User u=(User) q.getSingleResult();
		
		if(u!=null)
		{
			System.out.println(u);
		}
		else
		  {
			
				System.out.println("User not found");
			
		   }
		}


}
