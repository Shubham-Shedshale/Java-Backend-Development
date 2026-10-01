package org.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindQuestionDataById {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ManyToOneUni");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("Enter the question id:");
		
		QuestionData qd=em.find(QuestionData.class, new Scanner(System.in).nextInt());
		
		if(qd!=null)
		{
			System.out.println(qd);
		}
		else
		{
			System.out.println("Record not found");
		}

}
}
