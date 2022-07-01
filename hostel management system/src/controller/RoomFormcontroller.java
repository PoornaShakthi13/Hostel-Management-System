package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomFormcontroller {
    public JFXButton btnBack;
    public JFXButton btnAddRoom;
    public JFXButton btnDelete;
    public JFXButton btnUpdate;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();

        Parent parent = FXMLLoader.load(getClass().getResource("../view/DashBoardForm.fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(parent));
        stage2.setResizable(false);
        stage2.show();
    }

    public void btnAddRoomOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteRoomOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateRoomOnAction(ActionEvent actionEvent) {

    }
}
