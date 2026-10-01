package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindUserById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("enter the user id");
		User u=em.find(User.class, new Scanner(System.in).nextInt());
		
		if(u!=null) {
			System.out.println(u);
		}
		else
		{
			System.out.println("Result not found");
		}
	}

}
