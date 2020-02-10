package com.hibernate.testhibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRetrive {

	public static void main(String[] args) 
	{
        System.out.println( "Hello User" );
        Configuration configuration=new Configuration();
        configuration.configure("conf-hibernate.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        transaction.commit();
        Query query=session.createQuery("from User");
        List list=query.list();
        System.out.println(list);
	}

}
