package dao;

import dao.custom.impl.ReservationDaoImpl;
import dao.custom.impl.RoomDaoImpl;
import dao.custom.impl.StudentDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory(){
    }

    public static DaoFactory getDaoFactory(){
        if (daoFactory==null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes{
        STUDENT, ROOMS, RESERVATION
    }

    public SuperDao getDAO(DAOTypes types){
        switch (types){
            case STUDENT:
                return new StudentDaoImpl();

            case ROOMS:
                return new RoomDaoImpl();


            case RESERVATION:
                return new ReservationDaoImpl();

            default:
                return null;
        }
    }
}
