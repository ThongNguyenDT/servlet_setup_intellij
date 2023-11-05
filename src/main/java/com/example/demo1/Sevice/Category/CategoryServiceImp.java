package com.example.demo1.Sevice.Category;

import com.example.demo1.DAO.CategoryDaoImpl;
import com.example.demo1.Entities.CategoryEntity;
import jakarta.inject.Inject;

import java.util.List;

public class CategoryServiceImp implements ICategoryService{
    @Inject
    private CategoryDaoImpl categoryDao;

    @Override
    public void insert(CategoryEntity category) {
        categoryDao.insert(category);
    }

    @Override
    public void update(CategoryEntity category) {
        categoryDao.update(category);
    }
    @Override
    public void delete(Integer cateid) throws Exception {
        categoryDao.delete(cateid);
    }


    public CategoryEntity findById(Integer categoryid) {
        return categoryDao.findById(categoryid);
    }

    @Override
    public List<CategoryEntity> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public List<CategoryEntity> findByCategoryName(String categoryName) {
        return categoryDao.findByCategoryName(categoryName);
    }

    @Override
    public List<CategoryEntity> findAll(Integer page, Integer pageSize) {
        return categoryDao.findAll(true, page ,pageSize);
    }

    @Override
    public Integer count() {
        return categoryDao.countAll().intValue();
    }
}
