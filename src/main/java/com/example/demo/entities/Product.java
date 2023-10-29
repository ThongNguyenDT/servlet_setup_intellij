package com.example.demo.entities;

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

    
    
}

