package edu.iCET.controller;

import com.jfoenix.controls.JFXComboBox;
import edu.iCET.model.dto.CustomerAdminDTO;
import edu.iCET.service.CustomerAdminService;
import edu.iCET.service.impl.CustomerAdminServiceImpl;
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

    // Reference is of type CustomerAdminService (interface),
    // object is created from CustomerAdminServiceImpl (implementation)
    CustomerAdminService customerAdminService = new CustomerAdminServiceImpl();

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

        CustomerAdminDTO customer = new CustomerAdminDTO(
                lblID.getText(),
                cmbTitle.getValue(),
                txtName.getText(),
                txtPhoneNumber.getText(),
                txtEmail.getText()
        );

        boolean saved = customerAdminService.addCustomer(customer);

        if (saved){
            lblID.setText(customerAdminService.generateCustomerId());
        }

        txtName.clear();
        txtPhoneNumber.clear();
        txtEmail.clear();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblID.setText(customerAdminService.generateCustomerId());
        cmbTitle.getItems().addAll("Mr","Mrs","Miss");
        loadCustomers();
        lblID.setText(customerAdminService.generateCustomerId());
    }

    private void loadCustomers(){
        contentPane.getChildren().clear();
        double y = 10;

        customerAdminService.getAllCustomers();


    }

}
