package org.jsp.jpa_demo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FetchAllEmailIds {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createNamedQuery("FetchAllEmailIds");
		
		List<String> ml=q.getResultList();
		
		Iterator<String> i=ml.iterator();
		
		while(i.hasNext())
		{
			String email=i.next();
			System.out.println(email);
		}
	}

}
