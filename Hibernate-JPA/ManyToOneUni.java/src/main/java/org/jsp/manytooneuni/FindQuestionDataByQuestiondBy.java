package org.jsp.manytooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindQuestionDataByQuestiondBy {
	
     public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ManyToOneUni");
		EntityManager em=emf.createEntityManager();

		Query q=em.createQuery("select q from QuestionData q where q.questionedBy=?1");
		
		System.out.println("Enter the Name:");
		q.setParameter(1,new Scanner(System.in).next() );
		
		List<QuestionData> ql=q.getResultList();
		
		if(ql.isEmpty())
		{
			System.out.println("Record not found");
		}
		else
		{
			for(QuestionData qd: ql)
			{
				System.out.println(qd);
			}
		}
		
     }
}
