package org.jsp.jpa_demo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllNames {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createNamedQuery("FetchAllNames");
		
		List<String> ml=q.getResultList();
		
		Iterator<String> i=ml.iterator();
		
		while(i.hasNext())
		{
			String name=i.next();
			System.out.println(name);
		}
	}

}
