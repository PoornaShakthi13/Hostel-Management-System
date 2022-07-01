package dao.custom.impl;

import dao.custom.ReservationDao;
import entity.reservation;
import entity.room;
import entity.student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationDaoImpl implements ReservationDao {
    Session session;
    Transaction transaction;
    @Override
    public ArrayList<reservation> getAll() throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query reservations = session.createQuery("FROM reservation ");
        List<reservation> reservationList = reservations.list();
        transaction.commit();
        session.close();
        return (ArrayList<reservation>) reservationList;    }

    @Override
    public boolean save(reservation dto) throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        session.save(dto);
        transaction.commit();
        session.close();
        return true;    }

    @Override
    public boolean update(reservation dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public reservation search(String s) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean exist(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        List<reservation> list = session.createQuery("FROM reservation ORDER BY reservationId DESC").list();
        for (reservation reservation : list){
            String lastId = reservation.getReservationId();
            return lastId;
        }
        transaction.commit();
        session.close();
        return null;    }

    @Override
    public ArrayList<String> getIds() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean updateQty(int qty, String code) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public ArrayList<reservation> getAllRoomReservationsById(String Id) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public ArrayList<student> getAllStudentsById(String Id) throws ClassNotFoundException, SQLException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query student = session.createQuery("FROM student WHERE studentId = :studentId");
        student.setParameter("studentId", Id);
        List<student> students = student.list();
        transaction.commit();
        session.close();
        return (ArrayList<student>) students;
    }

    @Override
    public ArrayList<String> getStudentIds() throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query ids = session.createQuery("SELECT studentId FROM student");
        List<String> idList = ids.list();
        transaction.commit();
        session.close();
        return (ArrayList<String>) idList;    }

    @Override
    public ArrayList<String> getRoomIds() throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query ids = session.createQuery("SELECT roomId FROM room ");
        List<String> idList = ids.list();
        transaction.commit();
        session.close();
        return (ArrayList<String>) idList;    }

    @Override
    public ArrayList<room> getAllRoomsById(String Id) throws ClassNotFoundException, SQLException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query student = session.createQuery("FROM room WHERE roomId = :rId");
        student.setParameter("rId", Id);
        List<room> rooms = student.list();
        transaction.commit();
        session.close();
        return (ArrayList<room>) rooms;    }
}
