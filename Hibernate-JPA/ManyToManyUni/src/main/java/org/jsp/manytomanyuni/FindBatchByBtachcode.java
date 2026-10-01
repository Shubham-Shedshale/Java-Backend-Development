package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindBatchByBtachcode {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select b from Batch b where b.batch_code=?1");
		System.out.println("Enter the batch code");
		q.setParameter(1,new Scanner(System.in).next());
		
		List<Batch> bl=q.getResultList();
		
		if(bl.isEmpty())
		{
			System.out.println("No reocrd found");
		}
		else
		{
			for (Batch batch : bl) {
				System.out.println(batch);
			}
		}
	}
		


}
