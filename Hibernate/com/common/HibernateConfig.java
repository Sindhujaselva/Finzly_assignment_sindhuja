package com.common;

import com.entity.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateConfig {
//    public static SessionFactory getSessionFactory;

    public static SessionFactory getSessionFactory(){
        System.out.println("hi");
        Configuration cfg = new Configuration();
        System.out.println("hi");
        cfg.configure("hibernate.com.xml");
        System.out.println("hi");
//        cfg.addAnnotatedClass(Login.class);
        cfg.addAnnotatedClass(Login.class);
        SessionFactory sf =cfg.buildSessionFactory();
        System.out.println("hithere its me");
        return sf;

        }

}
