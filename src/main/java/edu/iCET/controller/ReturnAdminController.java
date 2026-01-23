package edu.iCET.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ReturnAdminController {

    @FXML
    private TableColumn<?, ?> colBookID;

    @FXML
    private TableColumn<?, ?> colCompleteBookID;

    @FXML
    private TableColumn<?, ?> colCompleteCustomerID;

    @FXML
    private TableColumn<?, ?> colCompleteDueDate;

    @FXML
    private TableColumn<?, ?> colCompleteFine;

    @FXML
    private TableColumn<?, ?> colCompleteIssueDate;

    @FXML
    private TableColumn<?, ?> colCompleteOverdueDate;

    @FXML
    private TableColumn<?, ?> colCompleteRentalID;

    @FXML
    private TableColumn<?, ?> colCustomerID;

    @FXML
    private TableColumn<?, ?> colDueDate;

    @FXML
    private TableColumn<?, ?> colFine;

    @FXML
    private TableColumn<?, ?> colIssueDate;

    @FXML
    private TableColumn<?, ?> colOverdueDate;

    @FXML
    private TableColumn<?, ?> colRentalID;

    @FXML
    private AnchorPane contentPane;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblID;

    @FXML
    private TextField txtBookID;

    @FXML
    private TextField txtCustomer;

    @FXML
    private TextField txtFine;

    @FXML
    void completeRentalOnAction(ActionEvent event) {

    }

}
