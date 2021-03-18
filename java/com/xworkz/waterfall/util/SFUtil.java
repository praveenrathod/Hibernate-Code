package com.xworkz.waterfall.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.waterfall.exception.SessionFactoryCreationException;

public class SFUtil {

	public static SessionFactory factory;
	
	public  static SessionFactory getFactory() {
		return factory;
	}
	static {
		try{Configuration configuration=new Configuration();
		configuration.configure();
	//	configuration.addAnnotatedClass(annotatedClass);
		factory= configuration.buildSessionFactory();
		if(factory!=null) {
			System.out.println("can create session factory");
		}else {
			throw new SessionFactoryCreationException("cant create session factory");
		}
		}
		catch (Exception e) {
		throw new SessionFactoryCreationException(e.getMessage());
		}
	}
}
