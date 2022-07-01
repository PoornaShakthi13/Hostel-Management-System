package dao.custom.impl;

import dao.custom.StudentDao;
import entity.student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    Session session;
    Transaction transaction;

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
    public ArrayList<student> getAll() throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query students = session.createQuery("FROM student ");
        List<student> studentList = students.list();
        transaction.commit();
        session.close();
        return (ArrayList<student>) studentList;    }

    @Override
    public boolean save(student dto) throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        session.save(dto);
        transaction.commit();
        session.close();
        return true;    }

    @Override
    public boolean update(student dto) throws SQLException, ClassNotFoundException {
        session = FactoryConfiguration.getInstance().getSessionFactory();
        transaction = session.beginTransaction();
        Query query = session.createQuery("UPDATE student SET name = :name, address= :address, contactNum= :contact, dob= :birth, gender= :gender WHERE studentId = :id");
        query.setParameter("name", dto.getName());
        query.setParameter("address", dto.getAddress());
        query.setParameter("contact", dto.getContactNum());
        query.setParameter("birth", dto.getDob());
        query.setParameter("gender", dto.getGender());
        query.setParameter("id", dto.getStudentId());
        query.executeUpdate();
        transaction.commit();
        session.close();
        return true;    }

    @Override
    public student search(String s) throws SQLException, ClassNotFoundException {
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
        Query delete = session.createQuery("DELETE FROM student WHERE studentId= :ID");
        delete.setParameter("ID", s);
        //session.delete(s);
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
        Query ids = session.createQuery("SELECT studentId FROM student");
        List<String> idList = ids.list();
        transaction.commit();
        session.close();
        return (ArrayList<String>) idList;    }

    @Override
    public boolean updateQty(int qty, String code) throws SQLException, ClassNotFoundException {
        return false;
    }
}
