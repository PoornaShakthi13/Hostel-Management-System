package dao.custom;

import dao.CrudDao;
import entity.reservation;
import entity.room;
import entity.student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReservationDao extends CrudDao<reservation,String> {
    ArrayList<reservation> getAllRoomReservationsById(String Id)throws ClassNotFoundException, SQLException;

    ArrayList<student> getAllStudentsById(String Id)throws ClassNotFoundException, SQLException;

    ArrayList<String> getStudentIds() throws SQLException, ClassNotFoundException;

    ArrayList<String> getRoomIds() throws SQLException, ClassNotFoundException;

    ArrayList<room> getAllRoomsById(String Id)throws ClassNotFoundException, SQLException;

}
