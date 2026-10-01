package org.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindQuestionDataByAnwerDataId {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ManyToOneUni");
		EntityManager em=emf.createEntityManager();

		Query q=em.createQuery("select a.qd from AnswerData a where a.id=?1");
		
		System.out.println("Enter the Answer Id:");
		q.setParameter(1,new Scanner(System.in).nextInt() );
		
		try {
		  QuestionData qd=(QuestionData) q.getSingleResult();
		  System.out.println(qd);
		}
		catch(NoResultException e)
		{
			System.out.println("No record found");
		}
		

		
		
		
	}
		

}
