package org.jsp.OneToOneUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPancardId {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToOneUni");
	    EntityManager em=emf.createEntityManager();
	    
	    Query q=em.createQuery("select p from Person p where p.card.id=?1");
	    System.out.println("Enter the Pancard");
	    q.setParameter(1, new Scanner(System.in).nextInt());
	   
	    Person p=(Person) q.getSingleResult();
	    
	    if(p!=null)
	    {
	    	System.out.println(p);
	    }
	    else
	    {
	    	System.out.println("No result found");
	    }
	}

}
