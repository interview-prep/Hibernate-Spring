package com.sandeep.interview.samples;

import com.sandeep.interview.samples.model.Address;
import com.sandeep.interview.samples.model.Person;
import org.springframework.context.ApplicationContext;
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
        Person person1 = (Person) context.getBean("person");
        System.out.println("p1:"+ person.hashCode());
        System.out.println("p2:"+ person1.hashCode());
        System.out.println("a1:"+ address.hashCode());
        System.out.println("a2:"+address1.hashCode());
        System.out.println();

        /*person.setFirstName("sandeep");
        person.setLastName("M");
        person.setAddress(address);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getClass().hashCode());

        person1.setFirstName("sandeep1");
        person1.setAddress(address1);
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAddress().getZipCode());
//        System.out.println(Person.getCountParent());
//        System.out.println(Address.getCountChild());
        System.out.println(person1.getClass().hashCode());*/

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