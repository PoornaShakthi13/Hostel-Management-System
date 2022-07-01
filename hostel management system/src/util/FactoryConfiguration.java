package util;

import entity.reservation;
import entity.room;
import entity.student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;

    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration=new Configuration().configure().
                addAnnotatedClass(student.class).addAnnotatedClass(room.class).addAnnotatedClass(reservation.class);

        sessionFactory=configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return factoryConfiguration==null ? factoryConfiguration=new FactoryConfiguration():
                factoryConfiguration;
    }

    public Session getSessionFactory(){
        return sessionFactory.openSession();
    }
}
