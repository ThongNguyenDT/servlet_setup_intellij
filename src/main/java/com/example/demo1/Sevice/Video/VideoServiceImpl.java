package com.example.demo1.Sevice.Video;

import com.example.demo1.DAO.CategoryDaoImpl;
import com.example.demo1.Entities.CategoryEntity;
import jakarta.inject.Inject;

import java.util.List;

public class VideoServiceImpl implements IVideoService{
    @Inject
    private CategoryDaoImpl categoryDAO;

    @Override
    public void insert(CategoryEntity favorites) {
        categoryDAO.insert(favorites);
    }

    @Override
    public void update(CategoryEntity favorites) {
        categoryDAO.update(favorites);
    }
    @Override
    public void delete(Integer cateid) throws Exception {
        categoryDAO.delete(cateid);
    }


    @Override
    public CategoryEntity findById(Integer favoritesid) {
        return categoryDAO.findById(favoritesid);
    }

    @Override
    public List<CategoryEntity> findAll() {
        return categoryDAO.findAll();
    }


    @Override
    public List<CategoryEntity> findAll(Integer page, Integer pageSize) {
        return categoryDAO.findAll(true, page ,pageSize);
    }

    @Override
    public Integer count() {
        return categoryDAO.countAll().intValue();
    }
}
