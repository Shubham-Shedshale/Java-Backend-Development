package org.jsp.OneToManyUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindEmployeeBySal {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToManyUni");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select e from Employee e where e.salary=?1");
		System.out.println("Enter the Employee Salary:");
		q.setParameter(1, new Scanner(System.in).nextDouble());
		
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
