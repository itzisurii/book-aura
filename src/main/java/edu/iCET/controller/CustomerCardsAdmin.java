package edu.iCET.controller;

import edu.iCET.model.dto.CustomerAdminDTO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.util.function.Consumer;

public class CustomerCardsAdmin {

    private CustomerAdminDTO customerAdminDTO;
    @FXML
    private ImageView imgTitle;

    @FXML
    private Label lblName;

    @FXML
    private Label lblPhoneNumber;

    private CustomerAdminDTO customer;

    private Consumer<CustomerAdminDTO> onClick;




    public CustomerAdminDTO customerAdminDTO(){
        return customerAdminDTO;
    }

    public void setData(CustomerAdminDTO customer, Consumer<CustomerAdminDTO> onClick){
        this.customer = customer;
        this.onClick = onClick;

        lblName.setText(customer.getName());
        lblPhoneNumber.setText(customer.getPhone());

        lblName.getParent().setOnMouseClicked( e -> {
            if (this.onClick != null){
                this.onClick.accept(customer);
            }
        });
    }
}
