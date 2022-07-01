package dao.custom.impl;

import dao.custom.RoomDao;
import entity.room;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDaoImpl implements RoomDao {
    Session session;
    Transaction transaction;

    @Override
    public ArrayList<room> getAllRoomsById(String Id) throws ClassNotFoundException, SQLException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query student = session.createQuery("FROM room WHERE roomId = :rId");
        student.setParameter("rId", Id);
        List<room> rooms = student.list();
        transaction.commit();
        session.close();
        return (ArrayList<room>) rooms;
    }

    @Override
    public ArrayList<room> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(room dto) throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        session.save(dto);
        transaction.commit();
        session.close();
        return true;    }

    @Override
    public boolean update(room dto) throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query query = session.createQuery("UPDATE room SET roomType = :type, advance= :money WHERE roomId = :id");
        query.setParameter("type", dto.getRoomType());
        query.setParameter("money", dto.getAdvance());
        query.setParameter("id", dto.getRoomId());
        query.executeUpdate();
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public room search(String s) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean exist(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query delete = session.createQuery("DELETE FROM room WHERE roomId= :ID");
        delete.setParameter("ID", s);
        delete.executeUpdate();
        transaction.commit();
        session.close();
        return true;    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<String> getIds() throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query ids = session.createQuery("SELECT roomId FROM room ");
        List<String> idList = ids.list();
        transaction.commit();
        session.close();
        return (ArrayList<String>) idList;    }

    @Override
    public boolean updateQty(int qty, String code) throws SQLException, ClassNotFoundException {
        return false;
    }
}
