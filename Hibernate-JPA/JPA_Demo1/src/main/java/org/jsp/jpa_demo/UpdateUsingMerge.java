package org.jsp.jpa_demo;



import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateUsingMerge 
{
   public static void main(String[] args) {
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		etran.begin();
		System.out.println("Enter the id");
		Merchant m=em.find(Merchant.class, new Scanner(System.in).nextInt());
		
		if(m!=null)
		{
		m.setId(10);   //updates only if we remove GenerationType or else primary keys will not update
		m.setName("Adidas");
		m.setGst_num("adidas123");
		m.setEmail("adidas@gmail.com");
		m.setPhone(1122234445);
		em.merge(m);
		etran.commit();
		}
		else
		{
			System.out.println("Record not found");
		}
}
}
