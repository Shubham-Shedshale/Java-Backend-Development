package org.jsp.OneToManyUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindEmployeeByDeptIdAndLoc {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToManyUni");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select d.elist from Dept d where d.id=?1 and d.loc=?2");
		System.out.println("Enter the Dept Id:");
		q.setParameter(1, new Scanner(System.in).nextInt());
		
		System.out.println("Enter the Dept Location:");
		q.setParameter(2, new Scanner(System.in).next());
		
		List<Employee> l=q.getResultList();
		
		if(l.isEmpty())
		{
			System.out.println("No record found");
		}
		else
		{
			for(Employee e:l)
			{
				System.out.println(e);
			}
		}
	}


}
