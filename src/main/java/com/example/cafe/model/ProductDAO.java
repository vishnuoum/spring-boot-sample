package com.example.cafe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class ProductDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private float price;

    private String veg_flag;

    private String status;

    @OneToOne(targetEntity = CategoryDAO.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CategoryDAO categoryDAO;

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

    public CategoryDAO getCategory() {
        return categoryDAO;
    }

    public void setCategory(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }
}
