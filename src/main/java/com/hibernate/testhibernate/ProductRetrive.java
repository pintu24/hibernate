package com.hibernate.testhibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductRetrive {

	public static void main(String[] args) 
	{
        System.out.println( "Showing Product" );
        Configuration configuration=new Configuration();
        configuration.configure("conf-hibernate.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        transaction.commit();
        Query query=session.createQuery("from Product");
        List list=query.list();
       // System.out.println(list);
        for(Object object:list)
        {
        	Product pro=(Product)object;
        	System.out.println(pro.getProductId());
        	System.out.println(pro.getProdutName());
        	System.out.println(pro.getProductDescription());
        	System.out.println(pro.getProductPrice());
        	System.out.println("");
        }
	}

}
