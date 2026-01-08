package edu.iCET.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class StaffDashboardController {

    @FXML
    private AnchorPane contentPane;

    @FXML
    public void initialize() {
        loadView("view/default_view.fxml");
    }


    @FXML
    void customersOnAction(ActionEvent event) {

    }

    @FXML
    void dashboardOnAction(ActionEvent event) {
        loadView("dashboard_view.fxml");
    }

    @FXML
    void employeesOnAction(ActionEvent event) {

    }

    @FXML
    void logoutOnAction(ActionEvent event) {

    }

    @FXML
    void ordersOnAction(ActionEvent event) {

    }

    @FXML
    void placeOrderOnAction(ActionEvent event) {

    }

    @FXML
    void productsOnAction(ActionEvent event) {

    }

    @FXML
    void returnsOnAction(ActionEvent event) {

    }

    @FXML
    void suppliersOnAction(ActionEvent event) {

    }

}
