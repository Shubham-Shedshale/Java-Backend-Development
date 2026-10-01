package org.jsp.onetoonebi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FinduserByName {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	
	Query q=em.createQuery("select u from User u where u.name=?1");
	
	System.out.println("Enter the name");
	q.setParameter(1, new Scanner(System.in).next());
	
	List<User> l=q.getResultList();
	
	if(l.isEmpty())
	{
		System.out.println("Result not found");
	}else
	{
		for(User u:l)
		{
			System.out.println(l);
		}
	}
	}
}
