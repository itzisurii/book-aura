package edu.iCET.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class RentalAdminController {

    @FXML
    private JFXComboBox<?> cmbBookId;

    @FXML
    private JFXComboBox<?> cmbCustomerID;

    @FXML
    private TableColumn<?, ?> colBookID;

    @FXML
    private TableColumn<?, ?> colCustomerID;

    @FXML
    private TableColumn<?, ?> colDueDate;

    @FXML
    private TableColumn<?, ?> colIssueDate;

    @FXML
    private TableColumn<?, ?> colRentalID;

    @FXML
    private AnchorPane contentPane;

    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void rentOnAction(ActionEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {

    }

}
