package org.jsp.OneToManyUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindDeptByName {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToManyUni");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select d from Dept d where d.name=?1");
		System.out.println("Enter the Dept Name:");
		q.setParameter(1, new Scanner(System.in).next());
		
		try {
		   Dept d=(Dept) q.getSingleResult();
			System.out.println(d);
		}
		catch(NoResultException e)
		{
			System.out.println("No record found");
		}
		
	}
}
