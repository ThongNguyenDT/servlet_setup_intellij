package com.example.demo1.Sevice.Video;

import com.example.demo1.Entities.CategoryEntity;

import java.util.List;

public interface IVideoService {
    void insert(CategoryEntity favorites);

    void update(CategoryEntity favorites);

    void delete(Integer cateid) throws Exception;

    CategoryEntity findById(Integer favoritesid);

    List<CategoryEntity> findAll();

    List<CategoryEntity> findAll(Integer page, Integer pageSize);

    Integer count();
}
