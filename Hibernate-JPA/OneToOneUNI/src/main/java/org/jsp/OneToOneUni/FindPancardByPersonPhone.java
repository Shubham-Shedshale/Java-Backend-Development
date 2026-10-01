package org.jsp.OneToOneUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByPersonPhone {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToOneUni");
	    EntityManager em=emf.createEntityManager();
	    
	    Query q=em.createQuery("select p.card from Person p where p.phone=?1");
	    System.out.println("Enter the Person Phone");
	    q.setParameter(1, new Scanner(System.in).nextLong());
	   
	    Pancard card=(Pancard) q.getSingleResult();
	    
	    if(card!=null)
	    {
	    	System.out.println(card);
	    }
	    else
	    {
	    	System.out.println("No result found");
	    }
	}
}
