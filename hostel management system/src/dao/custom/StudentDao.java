package dao.custom;

import dao.CrudDao;
import dao.SuperDao;
import entity.student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDao extends CrudDao<student,String> {
    ArrayList<student> getAllStudentsById(String Id)throws ClassNotFoundException, SQLException;

}
