package org.jspy.assignment;

//import java.lang.module.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCfg
{
  public static void main(String[] args) {
  	
  	Configuration conf=new Configuration();
  	conf.configure();
  	
  	SessionFactory sef=conf.buildSessionFactory();
  	System.out.println(sef);
		System.out.println("Loaded");
	}
}

