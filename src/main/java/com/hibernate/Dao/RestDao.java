
package com.hibernate.Dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.hibernate.Rest;

public class RestDao {
	
 public void save(Rest rest) {
	Configuration cfg = new Configuration();
	
	cfg.configure();
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	session.save(rest);
	transaction.commit();
	 
 }
}

