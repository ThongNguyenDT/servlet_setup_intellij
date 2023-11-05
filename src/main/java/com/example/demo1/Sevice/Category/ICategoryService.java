package com.example.demo1.Sevice.Category;

import com.example.demo1.Entities.CategoryEntity;

import java.util.List;

public interface ICategoryService {
    void insert(CategoryEntity category);
    void update(CategoryEntity category);
    void delete(Integer cateid) throws Exception;
    CategoryEntity findById(Integer categoryid);
    List<CategoryEntity> findAll();
    List<CategoryEntity> findByCategoryName(String categoryName);
    List<CategoryEntity> findAll(Integer page, Integer pageSize);
    Integer count();
}
