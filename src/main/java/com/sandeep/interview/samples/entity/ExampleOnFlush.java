package com.sandeep.interview.samples.entity;

import com.sandeep.interview.samples.model.Person;
import com.sandeep.interview.samples.model.PersonEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by Sandeep on 2/9/2017.
 */

public class ExampleOnFlush {

    public void perf() {
        try {
            Session session = getSession().openSession();
            session.getTransaction().begin();/*
            PersonEntity emp = new PersonEntity();
            emp.setId(17);
            emp.setFirstName("NEW SREE1");
            emp.setLastName("NEW DEVELOPMENT12");
            PersonEntity emp2 = new PersonEntity();
            emp2.setFirstName("NEW SREE2");
            emp2.setLastName("NEW DEVELOPMENT");
            PersonEntity emp3 = new PersonEntity();
            emp3.setFirstName("NEW SREE3");
            emp3.setLastName("NEW DEVELOPMENT");
            session.saveOrUpdate(emp);
            session.saveOrUpdate(emp2);
            session.saveOrUpdate(emp3);
            session.getTransaction().commit();*/
            List<PersonEntity> list = session.createQuery("from PersonEntity").list();

            for(PersonEntity ps : list){
                System.out.println(ps.getFirstName());
                System.out.println(ps.getLastName());
            }
            session.close();
//            PersonEntity ps = new PersonEntity();
//            Session session10 = getSession().openSession();
//            PersonEntity ps = (PersonEntity) session10.load(PersonEntity.class, 18);
//            System.out.println(ps.getFirstName());
//            PersonEntity load = (PersonEntity) session10.load(PersonEntity.class, 1);
//            System.out.println(load.getFirstName());
//            session10.close();
/*
            Session session1 = getSession().openSession();
            session1.getTransaction().begin();
            PersonEntity emp1 = (PersonEntity) session1.get(PersonEntity.class, 1);
            System.out.println(emp1.getId());
            System.out.println(emp1.getFirstName());
            System.out.println(emp1.getLastName());
//            session.flush();// this will run the update query to sync the data with database before commit
//            session1.close();
            Session session3 = getSession().openSession();
            session3.getTransaction().begin();
            PersonEntity emp3 = (PersonEntity) session3.get(PersonEntity.class, 1);
            System.out.println(emp3.getId());
            System.out.println(emp3.getFirstName());
            System.out.println(emp3.getLastName());
//            session.flush();// this will run the update query to sync the data with database before commit
//            session3.close();

            //Put break point and observe console

            Session session4 = getSession().openSession();
            session4.getTransaction().begin();
//            List<String> emp4 = (List<String>) session4.createQuery("select firstName as fn from PersonEntity")
//                    .setCacheable(true)
//                    .list();
            List<String> emp4 = (List<String>) session4.createSQLQuery("select firstName from PersonEntity")
                    .addScalar("firstName")
                    .setCacheable(true)
                    .list();

            System.out.println(emp4.get(1));
//            session.flush();// this will run the update query to sync the data with database before commit
//            session1.close();
            Session session5 = getSession().openSession();
            session5.getTransaction().begin();
//            List<String> emp5 = (List<String>) session4.createQuery("select firstName as fn from PersonEntity")
//                    .setCacheable(true)
//                    .list();
            List<String> emp5 = (List<String>) session4.createSQLQuery("select firstName  from PersonEntity")
                    .addScalar("firstName")
                    .setCacheable(true)
                    .list();

            System.out.println(emp5.get(0));*/
//
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ExampleOnFlush().perf();


    }

    public SessionFactory getSession() {

        SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
            return sessionFactory;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;

    }
}
