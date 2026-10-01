package org.jsp.jpa_demo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllGstNo {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createNamedQuery("FetchAllGstNo");
		
		List<String> ml=q.getResultList();
		
		if(ml.size()>0)
		{
			for(String s:ml)
			{
				System.out.println(s);
			}
		}
		else
		{
			System.out.println("No result as such");
		}
	}

}
