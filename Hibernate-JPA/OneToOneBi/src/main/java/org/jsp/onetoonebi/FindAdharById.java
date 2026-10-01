package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindAdharById {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("enter the user id");
		AadharCard card=em.find(AadharCard.class, new Scanner(System.in).nextInt());
		
		if(card!=null) {
			System.out.println(card);
		}
		else
		{
			System.out.println("Result not found");
		}
	}

}
