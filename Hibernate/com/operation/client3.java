package com.operation;

import com.common.HibernateConfig;
import com.entity.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class client3 {
    public static void main(String[] args) {
        SessionFactory sf = HibernateConfig.getSessionFactory();

        Session session = sf.openSession();

        org.hibernate.Transaction tr= session.beginTransaction();
        Login emp2 = new Login();
        emp2.setId(3);
        emp2.setUsername("kiran");
        emp2.setPassword("251426");
        session.delete(emp2);
        System.out.println("data is sucessfull deleted");
        tr.commit();
        session.close();
    }
}
