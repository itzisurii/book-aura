
package edu.iCET.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminDashboardController implements Initializable {

    @FXML
    private AnchorPane contentPane;

    @FXML
    void booksOnAction(ActionEvent event) {

    }

    @FXML
    void customersOnAction(ActionEvent event) {

    }

    @FXML
    void dashboardOnAction(ActionEvent event) {

    }

    @FXML
    void logoutOnAction(ActionEvent event) {

    }

    @FXML
    void rentalsOnAction(ActionEvent event) {

    }

    @FXML
    void reportsOnAction(ActionEvent event) {

    }

    @FXML
    void returnsOnAction(ActionEvent event) {

    }

    private void loadView(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/" + fxml));
            AnchorPane pane = loader.load();
            contentPane.getChildren().setAll(pane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

