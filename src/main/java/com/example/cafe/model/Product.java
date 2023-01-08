package com.example.cafe.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Product name cannot be null")
    private String name;

    @NotNull(message = "Category_id cannot be null")
    private int category_id;

    @NotNull(message = "Price cannot be null")
    private float price;

    @NotBlank(message = "Veg_flag cannot be null")
    private String veg_flag;

    private String status = "active";

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

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getVeg_flag() {
        return veg_flag;
    }

    public void setVeg_flag(String veg_flag) {
        this.veg_flag = veg_flag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
