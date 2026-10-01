package org.jsp.manytomaybi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindBatchesByStudentId {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select s.blist from Student s where s.id=?1");
		System.out.println("Enter the Student id:");
		q.setParameter(1, new Scanner(System.in).nextInt());
		
		List<Batch> bl=q.getResultList();
		if(bl.isEmpty())
		{
			System.out.println("No reocrd found");
		}
		else
		{
			for(Batch b: bl)
			{
				System.out.println(b);
			}
		}
	}

}
