package dao.custom;

import dao.CrudDao;
import entity.room;

import java.sql.SQLException;
import java.util.ArrayList;

public interface RoomDao extends CrudDao<room,String> {
    ArrayList<room> getAllRoomsById(String Id)throws ClassNotFoundException, SQLException;

}
