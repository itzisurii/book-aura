package edu.iCET.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

import java.io.IOException;


public class LoginFormController {

    @FXML
    private JFXComboBox<String> cmbUserType;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;
    

    @FXML
    public void initialize() {
        cmbUserType.getItems().addAll("Customer", "Staff");
    }

    Stage stage = new Stage();

    @FXML
    void loginOnAction(ActionEvent event) {
        String userType = cmbUserType.getValue();
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if(userType == null){
            System.out.println("Select user type!");
            return;
        }

        switch(userType){
            case "Customer":
                if (username.equals("isu") && password.equals("1234")){
                    try {
                        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/customer_dashboard.fxml"))));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    stage.show();
                    txtUsername.clear();
                    txtPassword.clear();
                }else{
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Login Failed");
                    alert.setHeaderText("Invalid Credentials");
                    alert.setContentText("Username or Password is incorrect.");
                    alert.show();
                }
                break;

            case "Staff":
                if(username.equals("staff") && password.equals("1234")){
                    try {
                        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/staff_dashboard.fxml"))));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    stage.show();
                    txtUsername.clear();
                    txtPassword.clear();
                }else{
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Staff Login Failed");
                    alert.setHeaderText("Invalid Credentials");
                    alert.setContentText("Username or Password is incorrect.");
                    alert.show();
                }
                break;
        }

    }


    @FXML
    void onRegisterClick(MouseEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/register_form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

}
