package bo.custom.impl;

import bo.custom.StudentBo;
import entity.student;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentBoImpl implements StudentBo {
    @Override
    public ArrayList<student> getAllStudent() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<student> getAllStudentById(String id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<String> getAllStudentIds() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean deleteStudent(String code) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean saveStudent(student dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean updateStudent(student dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean existsStudent(String code) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public student searchStudent(String code) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String generateNewStudentId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<String> searchStudentCode() throws SQLException, ClassNotFoundException {
        return null;
    }
}
