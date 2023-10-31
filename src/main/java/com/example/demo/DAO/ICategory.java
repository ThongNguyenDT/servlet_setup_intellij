package com.example.demo.DAO;


import com.example.demo.entities.Category;

import java.util.List;

public interface ICategory {
    void insert(Category category);
    void update(Category category);
    void delete(Integer dateid);
    Category findById(Integer cateid);
    List<Category> findAll();
    List<Category> findByCategoryName(String cateName);
    List<Category> findAll(Integer page, Integer pageSize);
    Integer count();
}
