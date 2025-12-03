package edu.iCET.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;


public class LoginFormController {

    @FXML
    private JFXComboBox<?> cmbUserType;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    public void initialize() {

    }

    @FXML
    void loginOnAction(ActionEvent event) {

    }
}
