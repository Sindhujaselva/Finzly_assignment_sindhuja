package com.operation;

import com.common.HibernateConfig;
import com.entity.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class client4 {
    public static void main(String[] args) {
        SessionFactory sf = HibernateConfig.getSessionFactory();

        Session session = sf.openSession();

        org.hibernate.Transaction tr= session.beginTransaction();
        Login emp2 = session.load(Login.class,2);

        System.out.println(emp2);
        tr.commit();
        session.close();
    }
}
