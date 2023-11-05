package com.example.demo1.Sevice.Favorites;

import com.example.demo1.Entities.FavoritesEntity;

import java.util.List;

public interface IFavoritesService {

    void insert(FavoritesEntity favorites);

    void update(FavoritesEntity favorites);

    void delete(Integer cateid) throws Exception;

    FavoritesEntity findById(Integer favoritesid);

    List<FavoritesEntity> findAll();

    List<FavoritesEntity> findAll(Integer page, Integer pageSize);

    Integer count();
}
