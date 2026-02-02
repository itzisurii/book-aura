package edu.iCET.controller;

import com.jfoenix.controls.JFXComboBox;
import edu.iCET.model.dto.CustomerAdminDTO;
import edu.iCET.service.CustomerAdminServiceImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomerAdminController implements Initializable {

    CustomerAdminServiceImpl customerAdminService = new CustomerAdminServiceImpl();

    @FXML
    private JFXComboBox<String> cmbTitle;

    @FXML
    private AnchorPane contentPane;

    @FXML
    private AnchorPane contentPane1;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblID;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhoneNumber;


    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {

    }

    @FXML
    void addCustomerOnAction(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbTitle.getItems().addAll("Mr","Mrs","Miss");
        loadCustomers();
        lblID.setText(customerAdminService.generateCustomerId());
    }

    private void loadCustomers(){
        contentPane.getChildren().clear();
        double y = 10;

        for (CustomerAdminDTO customer : customerAdminService.getAllCustomers()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/customer_cards_admin.fxml"));
                AnchorPane card = loader.load();

                CustomerCardsAdmin controller = loader.getController();
                controller.setData(customer);

                card.setLayoutY(y);
                y += 110;

                contentPane.getChildren().add(card);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
