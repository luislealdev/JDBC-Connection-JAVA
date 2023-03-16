module luisrrleal.com.jdbcconnection {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens luisrrleal.com.jdbcconnection to javafx.fxml;
    exports luisrrleal.com.jdbcconnection;

    opens luisrrleal.com.jdbcconnection.controllers;
    opens luisrrleal.com.jdbcconnection.models;
}