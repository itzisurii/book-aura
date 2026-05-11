package edu.iCET.controller;

import com.jfoenix.controls.JFXComboBox;
import edu.iCET.model.dto.CustomerAdminDTO;
import edu.iCET.service.CustomerAdminService;
import edu.iCET.service.impl.CustomerAdminServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CustomerAdminController implements Initializable {

    // Reference is of type CustomerAdminService (interface),
    // object is created from CustomerAdminServiceImpl (implementation)
    CustomerAdminService customerAdminService = new CustomerAdminServiceImpl();

    @FXML
    private JFXComboBox<String> cmbTitle;

    @FXML
    private AnchorPane cardsContainer;

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
    private GridPane gridCustomerAdmin;

    @FXML
    void deleteOnAction(ActionEvent event) {
        String id = lblID.getText();
        customerAdminService.deleteCustomerDetails(id);

        loadCustomers();
        clear();
    }

    @FXML
    void updateOnAction(ActionEvent event) {
        String id = lblID.getText();
        String title = cmbTitle.getValue();
        String name = txtName.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String email = txtEmail.getText();

        customerAdminService.updateCustomerDetails(id,title,name,phoneNumber,email);
        loadCustomers();
        clear();
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
            loadCustomers();
        }

        txtName.clear();
        txtPhoneNumber.clear();
        txtEmail.clear();

        clear();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblID.setText(customerAdminService.generateCustomerId());
        cmbTitle.getItems().addAll("Mr","Mrs","Miss");
        loadCustomers();
        lblID.setText(customerAdminService.generateCustomerId());

        gridCustomerAdmin.setAlignment(Pos.CENTER);
    }

    private void loadCustomers(){

        gridCustomerAdmin.getChildren().clear();

        List<CustomerAdminDTO> customerAdminDTOS = customerAdminService.getAllCustomers();

        int column = 0;
        int row = 0;

        for (CustomerAdminDTO c : customerAdminDTOS){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/customer_cards_admin.fxml"));
                AnchorPane card = loader.load();

                CustomerCardsAdmin cardController = loader.getController();
                cardController.setData(c, this::populateForm);

                gridCustomerAdmin.add(card, column, row);

                column++;
                if (column == 4){
                    column = 0;
                    row++;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private void populateForm(CustomerAdminDTO customer) {
        lblID.setText(customer.getCustomerId());
        cmbTitle.setValue(customer.getTitle());
        txtName.setText(customer.getName());
        txtPhoneNumber.setText(customer.getPhone());
        txtEmail.setText(customer.getEmail());
    }

    public void clear(){
        cmbTitle.setValue(null);
        txtName.clear();
        txtEmail.clear();
        txtPhoneNumber.clear();
        txtEmail.clear();
    }

}
