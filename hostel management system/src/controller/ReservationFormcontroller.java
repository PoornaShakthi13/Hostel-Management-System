package controller;

import bo.custom.ReservationBo;
import bo.custom.StudentBo;
import bo.custom.impl.ReservationBoImpl;
import bo.custom.impl.StudentBoImpl;
import com.jfoenix.controls.*;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import entity.reservation;
import entity.student;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class ReservationFormcontroller {
    public JFXButton btnBack;
    public JFXButton btnSave;
    public JFXButton btnCancel;
    public JFXButton btncheck;
    public JFXRadioButton rdoMale;
    public JFXRadioButton rdoFemale;
    public JFXButton btnReservationDetails;
    public JFXTextField txtStudentId;
    public JFXTextField txtStudentName;
    public JFXTextField txtStudentAddress;
    public JFXTextField txtStudentContact;
    public JFXDatePicker dateDob;
    public JFXTextField txtSelectRoom;
    public JFXTextField txtRoomNumber;
    public JFXTextField txtRoomType;
    public JFXTextField txtAdvance;
    public Label lblDate;
    public Label lblTime;
    public JFXComboBox cmbRoomId;

    String gender;
    ReservationBo reservationBo=new ReservationBoImpl();
    StudentBo studentBo=new StudentBoImpl();


    public void btnSaveOnAction(ActionEvent actionEvent) {
        try {
            String id = genarateNewId();
            studentBo.saveStudent(new student(txtStudentId.getText(),txtStudentName.getText(),txtStudentAddress.getText(),Integer.parseInt(txtStudentContact.getText()),String.valueOf(dateDob.getValue()),gender));
            reservationBo.saveReservation(new reservation(id, lblDate.getText(),txtStudentId.getText(),String.valueOf(cmbRoomId.getValue()),txtAdvance.getText()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String genarateNewId() throws SQLException, ClassNotFoundException {
        String id = reservationBo.generateNewReservationId();
        if (id != null){
            int newId = Integer.parseInt(id.replace("RES-",""))+1;
            return String.format("RES-%03d",newId);
        }else {
            return "RES-001";
        }
    }

    public void btnCancelOnActi0on(ActionEvent actionEvent) {
    }

    public void btnCheckOnAction(ActionEvent actionEvent) {
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();

        Parent parent = FXMLLoader.load(getClass().getResource("../view/DashBoardForm.fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(parent));
        stage2.setResizable(false);
        stage2.show();
    }

    public void rdoGenderOnAction(ActionEvent actionEvent) {

    }

    public void btnReservationDetailsOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnReservationDetails.getScene().getWindow();
        stage.close();

        Parent parent = FXMLLoader.load(getClass().getResource("../view/ReservationTableForm.fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(parent));
        stage2.setResizable(false);
        stage2.show();

    }
}
