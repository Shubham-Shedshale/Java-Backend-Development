package org.jsp.manytooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAnswerDataByAnswer {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ManyToOneUni");
		EntityManager em=emf.createEntityManager();

		Query q=em.createQuery("select a from AnswerData a where a.answer=?1");
		
		System.out.println("Enter the Answer:");
		q.setParameter(1,new Scanner(System.in).next() );
		
		List<AnswerData> al=q.getResultList();
		
		if(al.isEmpty())
		{
			System.out.println("Record not found");
		}
		else
		{
			for(AnswerData ad: al)
			{
				System.out.println(ad);
			}
		}
		
     }


}
