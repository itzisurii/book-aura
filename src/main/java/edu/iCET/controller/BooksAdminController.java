package edu.iCET.controller;

import edu.iCET.model.dto.BookAdminDTO;
import edu.iCET.service.BookAdminService;
import edu.iCET.service.impl.BookAdminServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class BooksAdminController implements Initializable {

    BookAdminService bookAdminService = new BookAdminServiceImpl();

    @FXML
    private AnchorPane contentPane;

    @FXML
    private Label lblBookID;

    @FXML
    private Label lblDate;

    @FXML
    private Spinner<?> spnNumber;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtTitle;

    @FXML
    private GridPane gridBooksAdmin;

    @FXML
    void addBooksOnAction(ActionEvent event) {

        BookAdminDTO book = new BookAdminDTO(
                lblBookID.getText(),
                txtTitle.getText(),
                txtAuthor.getText(),
                txtCategory.getText(),
                spnNumber.getPromptText()
        );

        boolean saved = bookAdminService.addBook(book);

        if (saved){
            lblBookID.setText(bookAdminService.generatedBookId());
        }

    }

    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    private void loadBooks(){

    }
}
