package com.mykhaylenko.hibernate.config;

import com.mykhaylenko.hibernate.model.User;
import com.mykhaylenko.hibernate.model.composition.Person;
import com.mykhaylenko.hibernate.model.composition.PersonalInformation;
import com.mykhaylenko.hibernate.model.inheritance.Address;
import com.mykhaylenko.hibernate.model.inheritance.BillingAddress;
import com.mykhaylenko.hibernate.model.inheritance.LocalAddress;
import com.mykhaylenko.hibernate.model.associations.Car;
import com.mykhaylenko.hibernate.model.associations.Wheel;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Pavlo.Mykhaylenko on 5/24/2016.
 */
final public class HibernateFactory {

    private static HibernateFactory hibernateFactory = null;
    private static SessionFactory sessionFactory = null;

    private HibernateFactory() {
    }

    public static HibernateFactory getInstance() {
        if (hibernateFactory != null) {
            return hibernateFactory;
        }
        return hibernateFactory = new HibernateFactory();
    }

    public SessionFactory getSessionFactory() {
        if (sessionFactory != null) {
            return sessionFactory;
        }

        return sessionFactory = new Configuration()
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(BillingAddress.class)
                .addAnnotatedClass(LocalAddress.class)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Wheel.class)
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(PersonalInformation.class)
                .buildSessionFactory();
    }
}
