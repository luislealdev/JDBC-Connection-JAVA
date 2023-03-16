package luisrrleal.com.jdbcconnection.models;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String color;
    private  String image;
    private String description;
    private String size;
    private int quantity;
    private int category_id;
    private double sale_price;
    private double purchase_price;

    public Product(){

    }

    public Product(int id, String name, String color, String image, String description, String size, int quantity, int category_id, double sale_price, double purchase_price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.image = image;
        this.description = description;
        this.size = size;
        this.quantity = quantity;
        this.category_id = category_id;
        this.sale_price = sale_price;
        this.purchase_price = purchase_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public double getSale_price() {
        return sale_price;
    }

    public void setSale_price(double sale_price) {
        this.sale_price = sale_price;
    }

    public double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(double purchase_price) {
        this.purchase_price = purchase_price;
    }
}
