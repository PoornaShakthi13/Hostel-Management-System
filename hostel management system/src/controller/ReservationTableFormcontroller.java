package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ReservationTableFormcontroller {
    public JFXButton btnReUpdate;
    public JFXButton btnReDelete;
    public TableView tblReservations;
    public JFXButton btnBack;

    public void btnReUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnReDeleteOnAction(ActionEvent actionEvent) {
    }

    public void btnBackOnACtion(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();

        Parent parent = FXMLLoader.load(getClass().getResource("../view/ReservationForm.fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(parent));
        stage2.setResizable(false);
        stage2.show();
    }
}
