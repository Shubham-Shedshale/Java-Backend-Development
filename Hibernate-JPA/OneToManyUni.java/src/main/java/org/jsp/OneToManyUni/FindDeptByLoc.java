package org.jsp.OneToManyUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindDeptByLoc {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToManyUni");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select d from Dept d where d.loc=?1");
		System.out.println("Enter the Location Name:");
		q.setParameter(1, new Scanner(System.in).next());
		
		List<Dept> l=q.getResultList();
		
		if(l.isEmpty())
		{
			System.out.println("No record found");
		}
		else
		{
			for(Dept d:l)
			{
				System.out.println(d);
			}
		}
	}

}
