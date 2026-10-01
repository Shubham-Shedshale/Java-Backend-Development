package org.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindAnswerDataById {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ManyToOneUni");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("Enter the question id:");
		
		AnswerData ad=em.find(AnswerData.class, new Scanner(System.in).nextInt());
		
		if(ad!=null)
		{
			System.out.println(ad);
		}
		else
		{
			System.out.println("Record not found");
		}

}

}
