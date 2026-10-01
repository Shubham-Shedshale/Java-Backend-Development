package org.jsp.onetomanyormanytoonebi;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCfg {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		System.out.println(emf);
	}

}
