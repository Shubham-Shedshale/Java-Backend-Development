package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStudentsByBatchCode {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select b.slist from Batch b where b.batch_code=?1");
		System.out.println("Enter the batch code");
		q.setParameter(1, new Scanner(System.in).next());
		
		List<Student> sl=q.getResultList();
		
		if(sl.isEmpty())
		{
			System.out.println("No reocrd found");
		}
		else
		{
			for (Student s: sl) {
				System.out.println(s);
			}
		}
	}



}
