package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAdharByNoAndAdrress {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select card from AadharCard card where card.number=?1 and card.address=?2");

		System.out.println("Enter the Aadhar number");
		q.setParameter(1, new Scanner(System.in).nextLong());
		
		System.out.println("Enter the Address");
		q.setParameter(2, new Scanner(System.in).next());
		
		
		AadharCard card=(AadharCard) q.getSingleResult();
		
		if(card!=null)
		{
			System.out.println(card);
		}
		else
		  {
			
				System.out.println("User not found");
			
		   }
		}

}
