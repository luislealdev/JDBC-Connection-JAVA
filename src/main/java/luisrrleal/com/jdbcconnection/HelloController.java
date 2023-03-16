package luisrrleal.com.jdbcconnection;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import luisrrleal.com.jdbcconnection.controllers.ShowProductList;
import luisrrleal.com.jdbcconnection.models.Product;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;
    private List<Product> products = new ArrayList<>();

    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    */


    @FXML
    protected void onHelloButtonClick() {
        String query = "select * from product;";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            while (rs.next())
            {
                products.add(new Product(rs.getInt("id"), rs.getString("name"),rs.getString("color"),rs.getString("image"),rs.getString("description"), rs.getString("size"), rs.getInt("quantity"), rs.getInt("category_id"), Double.parseDouble(rs.getString("sale_price")), Double.parseDouble(rs.getString("purchase_price"))));
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("NAME: " + rs.getString("name"));
                System.out.println("COLOR: " + rs.getString("color"));
                System.out.println("IMAGE: " + rs.getString("image"));
                System.out.println("DESC: " + rs.getString("description"));
                System.out.println("SIZE: " + rs.getString("size"));
                System.out.println("QUANTITY: " + rs.getString("quantity"));
                System.out.println("CATEGORY ID: " + rs.getString("category_id"));
                System.out.println("SALE PRICE: " + rs.getString("sale_price"));
                System.out.println("PURCHASE PRICE: " + rs.getString("purchase_price"));
            }
            welcomeText.setText("Retrieving data...");
        } catch (SQLException e) {
            welcomeText.setText(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void onViewButtonClick(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("showProductList.fxml"));

        try {
            ShowProductList ShowProductList = new ShowProductList();
            ShowProductList.setProductList(products);
            loader.setController(ShowProductList);

            Parent root = loader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root, 800, 350);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        for(Person p: people){
            System.out.println("Name: " + p.getName());
            System.out.println("Email: " + p.getMail());
            System.out.println("Address: " + p.getAddress());
        }
        */

    }

    Connection conn = MySQLConnection.getConnection();
}