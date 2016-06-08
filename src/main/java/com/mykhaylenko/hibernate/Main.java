package com.mykhaylenko.hibernate;

import com.mykhaylenko.hibernate.config.HibernateFactory;
import com.mykhaylenko.hibernate.model.associations.Car;
import com.mykhaylenko.hibernate.model.associations.Wheel;
import org.hibernate.*;
import org.hibernate.transform.ResultTransformer;

import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 5/24/2016.
 */
public class Main {

    public static void main(String[] args) {
        HibernateFactory instance = HibernateFactory.getInstance();
        SessionFactory sessionFactory = instance.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            Query sqlQuery = session.createSQLQuery("select w.id, w.radius, w.trademark, w.car_id from Wheel w where w.id = :id");
            Wheel w = (Wheel) sqlQuery.uniqueResult();
            System.out.println(w.getRadius());

            Criteria criteria = session.createCriteria(Car.class);
            criteria.setMaxResults(10);
            List<Car> list = criteria.list();
            list.forEach(s-> System.out.println(s.getName()));

            transaction.commit();
        } finally {
            session.clear();
            session.close();
            sessionFactory.close();
            System.out.println("end");
        }
    }
}
