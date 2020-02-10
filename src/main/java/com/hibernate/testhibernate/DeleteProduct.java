package com.hibernate.testhibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteProduct 
{

	public static void main(String[] args)
	{
		Product product=new Product();
		product.setProductId("433fg3");
        System.out.println( "Deleting Product" );
        Configuration configuration=new Configuration();
        configuration.configure("conf-hibernate.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.delete(product);
        Transaction transaction=session.beginTransaction();
        transaction.commit();
        System.out.println("deleted");
        session.close();
	}

}
