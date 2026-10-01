package org.jsp.OneToOneUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardById {
	
	public static void main(String[] args) {
		
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToOneUni");
		    EntityManager em=emf.createEntityManager();
		    
		    Query q=em.createQuery("select card from Pancard card where card.id=?1");
		    System.out.println("Enter the Pan id");
		    
		   	Pancard card=em.find(Pancard.class, new Scanner(System.in).nextInt());
		   	
		   	if(card!=null)
		   	{
		    System.out.println(card);
		   	}
		   	else
		   	{
		   		System.out.println("No record found");
		   	}
		   
		}
	

}
