package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStuBetweenPerRange {


	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select s from Student s where s.marks between ?1 and ?2");
		
		System.out.println("Enter the minimum marks");
		q.setParameter(1, new Scanner(System.in).nextDouble());
		System.out.println("Enter the maximum marks");
		q.setParameter(2, new Scanner(System.in).nextDouble());
		
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
