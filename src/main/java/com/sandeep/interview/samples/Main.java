package com.sandeep.interview.samples;

import com.sandeep.interview.samples.entity.Address;
import com.sandeep.interview.samples.entity.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/**
 * Created by SMALA on 7/31/2016.
 */
public class Main{
    private static final Logger LOGGER = Logger.getLogger("Hibernate-Tutorial");

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/sandeep/interview/spring/beans.xml");
        Person person = (Person) context.getBean("person");
        Address address= (Address) context.getBean("address");
        Address address1= (Address) context.getBean("address");
        person.setFirstName("sandeep");
        person.setLastName("M");
        person.setAddress(address);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getClass().hashCode());
        Person person1 = (Person) context.getBean("person1");
        person1.setFirstName("sandeep1");
        person1.setAddress(address1);
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAddress().getZipCode());
//        System.out.println(Person.getCountParent());
//        System.out.println(Address.getCountChild());
        System.out.println(person1.getClass().hashCode());

        // singleton result
        /*sandeep
                M
        hash code : 1879034789
        sandeep
                M
        hash code : 1879034789*/

        //protype result
        /*sandeep
          M
        hash code : 1879034789
        null
        null
        hash code : 1879034789*/
    }


    /*public void run() {
        SessionFactory sessionFactory = null;
        Session session = null;
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            session = sessionFactory.openSession();
            Person person = new Person();
            person.setFirstName("Homer");
            person.setLastName("Simpson");
            session.save(person);
//            persistPerson(session);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        } finally {
            if (session != null) {
                session.close();
            }
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }*/
}