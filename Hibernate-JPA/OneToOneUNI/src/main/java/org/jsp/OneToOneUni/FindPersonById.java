package org.jsp.OneToOneUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToOneUni");
	    EntityManager em=emf.createEntityManager();
	    
	    Query q=em.createQuery("select p from Person p where p.id=?1");
	    System.out.println("Enter the id");
	    
	   	Person p=em.find(Person.class, new Scanner(System.in).nextInt());
	   	
	   	if(p!=null)
	   	{
	    System.out.println(p);
	   	}
	   	else
	   	{
	   		System.out.println("No record found");
	   	}
	   
	}

}
