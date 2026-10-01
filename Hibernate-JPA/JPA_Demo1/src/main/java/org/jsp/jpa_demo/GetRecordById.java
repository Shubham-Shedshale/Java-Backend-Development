package org.jsp.jpa_demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetRecordById {
	public static void main(String[] args) {
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		
		etran.begin();
		System.out.println("Enter the id");
		
		Merchant m=em.find(Merchant.class, new Scanner(System.in).nextInt());
		
		if(m!=null)
		{
			System.out.println(m.getId()+" "+m.getName()+" "+m.getGst_num()+" "+m.getEmail()+" "+m.getPassword()+" "+m.getPhone());
		}
		else
		{
			System.out.println("Record not found");
		}
	}

}
