package edu.iCET.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ReportAdminController {

    @FXML
    private AnchorPane contentPane;

    @FXML
    private Label lblActiveRentalCount;

    @FXML
    private Label lblOverdueRentalCount;

    @FXML
    private Label lblTotalBookCount;

    @FXML
    void generateReportOnAction(ActionEvent event) {

    }

}
