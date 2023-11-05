package com.example.demo1.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Category")
@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "nvarchar(200)")
    private String CategoryName;
    @Column(columnDefinition = "nvarchar(MAX)")
    private String icon;
    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Product> products;


    public Category() {
        super();
    }

    public Category(String categoryName, String icon, List<Product> products) {
        CategoryName = categoryName;
        this.icon = icon;
        this.products = products;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
