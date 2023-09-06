package com.operation;

import com.common.HibernateConfig;
import com.entity.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.sql.SQLOutput;
import java.util.List;
import org.hibernate.Criteria;


public class Client1 {
    public static void main(String[] args) {
        SessionFactory sf = HibernateConfig.getSessionFactory();

        Session session = sf.openSession();

        org.hibernate.Transaction tr= session.beginTransaction();


//        Login l = session.get(Login.class,1);
//        System.out.println(l);
//        tr.commit();
        Login emp = new Login();
        emp.setId(3);
        emp.setUsername("kiran");
        emp.setPassword("40000");

        emp.setId(4);
        emp.setUsername("keerthi");
        emp.setPassword("54281");
        session.save(emp);


//        emp.setId(5);
//        emp.setUsername("ishwaraya");
//        emp.setPassword("40522");
////        System.out.println(l);
//        session.save(emp);
        tr.commit();


//        Criteria criteria = session.createCriteria(Login.class);
//        criteria.add(Restrictions.save("id",1));
//        List<Login> list =criteria.list();
//        for(Login login:list){
//            System.out.println(login);
//        }

        session.close();

    }

}
