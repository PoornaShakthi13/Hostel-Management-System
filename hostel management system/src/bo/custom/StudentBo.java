package bo.custom;

import entity.student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentBo {
    ArrayList<student> getAllStudent() throws SQLException, ClassNotFoundException;

    ArrayList<student> getAllStudentById(String id) throws SQLException, ClassNotFoundException;

    ArrayList<String> getAllStudentIds() throws SQLException, ClassNotFoundException;

    boolean deleteStudent(String code) throws SQLException, ClassNotFoundException;

    boolean saveStudent(student dto) throws SQLException, ClassNotFoundException;

    boolean updateStudent(student dto) throws SQLException, ClassNotFoundException;

    boolean existsStudent(String code) throws SQLException, ClassNotFoundException;

    student searchStudent(String code) throws SQLException, ClassNotFoundException;

    String generateNewStudentId() throws SQLException, ClassNotFoundException;

    ArrayList<String> searchStudentCode() throws SQLException, ClassNotFoundException;
}
