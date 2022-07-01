package bo.custom.impl;

import bo.custom.ReservationBo;
import entity.reservation;

import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationBoImpl implements ReservationBo {
    @Override
    public ArrayList<reservation> getAllStudent() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean deleteReservation(String code) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean saveReservation(reservation dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean updateReservation(reservation dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean existsReservation(String code) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public reservation searchReservation(String code) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String generateNewReservationId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<String> searchReservationCode() throws SQLException, ClassNotFoundException {
        return null;
    }
}
