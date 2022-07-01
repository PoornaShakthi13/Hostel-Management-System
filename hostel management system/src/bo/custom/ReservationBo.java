package bo.custom;

import entity.reservation;
import entity.student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReservationBo {
    ArrayList<reservation> getAllStudent() throws SQLException, ClassNotFoundException;

    boolean deleteReservation(String code) throws SQLException, ClassNotFoundException;

    boolean saveReservation(reservation dto) throws SQLException, ClassNotFoundException;

    boolean updateReservation(reservation dto) throws SQLException, ClassNotFoundException;

    boolean existsReservation(String code) throws SQLException, ClassNotFoundException;

    reservation searchReservation(String code) throws SQLException, ClassNotFoundException;

    String generateNewReservationId() throws SQLException, ClassNotFoundException;

    ArrayList<String> searchReservationCode() throws SQLException, ClassNotFoundException;

}
