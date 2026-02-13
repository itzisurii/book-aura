package edu.iCET.controller;

import edu.iCET.model.dto.CustomerAdminDTO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.function.Consumer;

public class CustomerCardsAdmin {

    private CustomerAdminDTO customerAdminDTO;
    @FXML
    private ImageView imgTitle;

    @FXML
    private AnchorPane root;

    @FXML
    private Label lblName;

    @FXML
    private Label lblPhoneNumber;

    private CustomerAdminDTO customer;

    private Consumer<CustomerAdminDTO> onClick;


    public CustomerAdminDTO customerAdminDTO() {

        return customerAdminDTO;
    }

    public void setData(CustomerAdminDTO customer, Consumer<CustomerAdminDTO> onClick) {
        this.customer = customer;
        this.onClick = onClick;

        lblName.setText(customer.getName());
        lblPhoneNumber.setText(customer.getPhone());

        setTitleImage(customer.getTitle());

        root.setOnMouseClicked(e -> {
            if (onClick != null) {
                onClick.accept(customer);
            }
        });
    }

    private void setTitleImage(String title) {

        if (title == null || title.isBlank()) {
            imgTitle.setImage(
                    new Image(getClass().getResourceAsStream("/img/miss.png"))
            );
            return;
        }

        String imagePath;

        switch (title) {
            case "Miss":
                imagePath = "/img/miss.png";
                break;

            case "Mrs":
                imagePath = "/img/mrs.png";
                break;

            case "Mr":
                imagePath = "/img/mr.png";
                break;

            default:
                imagePath = "/img/default.png";
        }

        var stream = getClass().getResourceAsStream(imagePath);

        if (stream == null) {
            System.err.println("❌ Image not found: " + imagePath);
            return;
        }
        imgTitle.setImage(new Image(stream));
    }
}
