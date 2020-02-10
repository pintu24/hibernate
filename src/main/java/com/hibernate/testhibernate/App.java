package com.hibernate.testhibernate;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User user=new User();
    	user.setEmail("zzz@zzz.com");
    	user.setUserName("zzz");
    	user.setPassword("zzz");
    	user.setMobileNo("000");
        System.out.println( "Hello World!" );
        Configuration configuration=new Configuration();
        configuration.configure("conf-hibernate.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.save(user);
        session.close();
    }
}
