package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;
import util.Uiloader;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

public class Loginformcontroller implements Uiloader, Initializable {
    public JFXTextField txtUserName;
    public JFXPasswordField txtPassword;
    public JFXButton btnlogin;
    public Label lblDate;
    public Label lblTime;
    public JFXButton btnSignup;

    NotificationController notification=new NotificationController();



    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        if(txtUserName.getText().equals("Owner") && txtPassword.getText().equals("Owner")){
            loadui("DashBoardForm");
           notification.confirmMassage("Login Successful...!","Welcome to the System");
        }
//        }else{
//            txtPassword.setStyle("-fx-border-color: red");
//            txtUserName.setStyle("-fx-border-color: red");
//           // notification.errorMassage("Something Wrong...!","Please Check User Name Or Password again.");
       }



    private void loadDateAndTime() {
        lblDate.setText(new SimpleDateFormat("yyyy/MM/dd, EEEE").format(new Date()));

        Timeline clock = new Timeline(new KeyFrame(javafx.util.Duration.ZERO, e->{
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
            String time = currentTime.format(dateTimeFormatter);
            lblTime.setText(time);
        }),
                new KeyFrame(Duration.seconds(1))
        );
         clock.setCycleCount(Animation.INDEFINITE);
         clock.play();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadDateAndTime();
    }

    @Override
    public void loadui(String location) throws IOException {
        Stage stage = (Stage) btnlogin.getScene().getWindow();
        stage.close();

        Parent parent = FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(parent));
        stage2.setResizable(false);
        stage2.show();

    }

    public void btnSignUpOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnSignup.getScene().getWindow();
        stage.close();

        Parent parent = FXMLLoader.load(getClass().getResource("../view/SignUpForm.fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(parent));
        stage2.setResizable(false);
        stage2.show();
    }
}
