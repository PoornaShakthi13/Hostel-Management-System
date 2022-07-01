package bo.custom.impl;

import bo.custom.RoomBo;
import entity.room;

import java.sql.SQLException;
import java.util.ArrayList;

public class RoomBoImpl implements RoomBo {
    @Override
    public ArrayList<room> getAllRooms() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<String> getAllRoomIds() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean deleteRoom(String code) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean saveRoom(room dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean updateRoom(room dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean existsRoom(String code) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public room searchRoom(String code) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String generateNewRoomId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<String> searchRoomCode() throws SQLException, ClassNotFoundException {
        return null;
    }
}
