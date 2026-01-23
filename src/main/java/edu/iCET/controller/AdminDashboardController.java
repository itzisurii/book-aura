
package edu.iCET.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminDashboardController implements Initializable {

    @FXML
    private AnchorPane contentPane;

    @FXML
    void booksOnAction(ActionEvent event) {
        loadUI("/view/book_admin_form.fxml");
    }

    @FXML
    void customersOnAction(ActionEvent event) {
        loadUI("/view/customers_admin_form.fxml");
    }

    @FXML
    void dashboardOnAction(ActionEvent event) {
        loadUI("/view/dashboard_admin_form.fxml");
    }

    @FXML
    void logoutOnAction(ActionEvent event) {

    }

    @FXML
    void rentalsOnAction(ActionEvent event) {

        loadUI("/view/rental_admin_form.fxml");
    }

    @FXML
    void reportsOnAction(ActionEvent event) {
        loadUI("/view/report_admin_form.fxml");
    }

    @FXML
    void returnsOnAction(ActionEvent event) {
        loadUI("/view/return_admin_form.fxml");
    }

    //-------------------Load UI-------------------//
    private void loadUI(String path) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource(path));
            contentPane.getChildren().clear();
            contentPane.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadUI("/view/dashboard_admin_form.fxml");
    }
}

