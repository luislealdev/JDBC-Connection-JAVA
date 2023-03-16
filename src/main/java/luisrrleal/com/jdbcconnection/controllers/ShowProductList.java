package luisrrleal.com.jdbcconnection.controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import luisrrleal.com.jdbcconnection.models.Product;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ShowProductList implements Initializable {
    @FXML
    TableView<Product> tblProduct;
    private List<Product> productList = new ArrayList<>();

    public void setProductList(List<Product> productList){
        this.productList = productList;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tblProduct.setItems(FXCollections.observableArrayList(productList));
    }
}
