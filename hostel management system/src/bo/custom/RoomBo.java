package bo.custom;

import entity.room;

import java.sql.SQLException;
import java.util.ArrayList;

public interface RoomBo {
    ArrayList<room> getAllRooms() throws SQLException, ClassNotFoundException;

    ArrayList<String> getAllRoomIds() throws SQLException, ClassNotFoundException;

    boolean deleteRoom(String code) throws SQLException, ClassNotFoundException;

    boolean saveRoom(room dto) throws SQLException, ClassNotFoundException;

    boolean updateRoom(room dto) throws SQLException, ClassNotFoundException;

    boolean existsRoom(String code) throws SQLException, ClassNotFoundException;

    room searchRoom(String code) throws SQLException, ClassNotFoundException;

    String generateNewRoomId() throws SQLException, ClassNotFoundException;

    ArrayList<String> searchRoomCode() throws SQLException, ClassNotFoundException;

}
