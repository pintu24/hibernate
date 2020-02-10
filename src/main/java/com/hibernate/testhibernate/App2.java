package com.hibernate.testhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) 
	{
		Product product=new Product();
		product.setProductId("112e34");
		product.setProdutName("oneplus 8");
		product.setProductDescription("8GB RAM 128 GB storage");
		product.setProductPrice("42000");
		Configuration configuration=new Configuration();
		configuration.configure("conf-hibernate.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.save(product);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}

}
