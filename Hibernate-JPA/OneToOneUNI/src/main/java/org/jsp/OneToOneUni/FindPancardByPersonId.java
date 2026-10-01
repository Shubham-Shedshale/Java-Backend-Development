package org.jsp.OneToOneUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByPersonId {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToOneUni");
	    EntityManager em=emf.createEntityManager();
	    
	    Query q=em.createQuery("select p.card from Person p where p.id=?1");
	    System.out.println("Enter the Person id");
	    q.setParameter(1, new Scanner(System.in).nextInt());
	   
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
