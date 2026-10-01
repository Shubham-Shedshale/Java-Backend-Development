package org.jsp.onetomanyormanytoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyMerchantByIdAndPass {
	
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		
		Query q=em.createQuery("select m from Merchant m where m.id=?1 and m.password=?2");
		System.out.println("Enter the Id of the merchant:");
		q.setParameter(1, new Scanner(System.in).nextInt());
		
		System.out.println("Enter the password");
		q.setParameter(2, new Scanner(System.in).next());
		
		try {
		Merchant m=(Merchant) q.getSingleResult();
			System.out.println("Login Succesfull");
		}
		catch(NoResultException e)
		{
			System.out.println("Invalid Credentials");
		}
	}


}
