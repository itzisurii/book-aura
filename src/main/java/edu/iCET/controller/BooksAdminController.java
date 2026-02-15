package edu.iCET.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class BooksAdminController {

    @FXML
    private AnchorPane contentPane;

    @FXML
    private Label lblBookID;

    @FXML
    private Label lblDate;

    @FXML
    private Spinner<?> spnNumber;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtTitle;

    @FXML
    void addBooksOnAction(ActionEvent event) {

    }

    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {

    }
}
