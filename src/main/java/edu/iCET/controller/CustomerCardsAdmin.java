package edu.iCET.controller;

import edu.iCET.model.dto.CustomerAdminDTO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class CustomerCardsAdmin {

    private CustomerAdminDTO customerAdminDTO;
    @FXML
    private ImageView imgTitle;

    @FXML
    private Label lblName;

    @FXML
    private Label lblPhoneNumber;


    public void setData(CustomerAdminDTO customer) {
        this.customerAdminDTO = customer;

        lblName.setText(customer.getTitle() + " " + customer.getName());
        lblPhoneNumber.setText(customer.getPhone());
    }

    public CustomerAdminDTO customerAdminDTO(){
        return customerAdminDTO;
    }
}
