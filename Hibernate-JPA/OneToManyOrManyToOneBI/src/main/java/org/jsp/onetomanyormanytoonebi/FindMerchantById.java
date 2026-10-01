package org.jsp.onetomanyormanytoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindMerchantById {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		
		System.out.println("Enter the Merchant Id:");
		Merchant m=em.find(Merchant.class, new Scanner(System.in).nextInt());
		
		if(m!=null) {
			System.out.println(m);
		}
		else
		{
			System.out.println("Record not found");
		}
	}

}
