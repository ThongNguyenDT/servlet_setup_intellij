package com.example.demo1.Entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Product")
@NamedQuery(name = "Product.findAll", query = "SELECT c FROM Product c")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "phong", nullable = false)
    private Integer phong;

    @Basic
    @Column(name = "name", nullable = false, columnDefinition = "nvarchar(MAX)")
    private String name;
    public Product() {
        super();
    }
    public Product(Integer phong, String name) {
        this.phong = phong;
        this.name = name;
    }

    public Integer getPhong() {
        return phong;
    }


    public void setPhong(Integer phong) {
        this.phong = phong;
    }


    public Product(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    
}

