package com.example.demo1.Sevice.Favorites;

import com.example.demo1.DAO.FavoritesDAOImpl;
import com.example.demo1.Entities.FavoritesEntity;
import jakarta.inject.Inject;

import java.util.List;

public class FavoritesServiceImpl implements IFavoritesService{
    @Inject
    private FavoritesDAOImpl favoritesDAO;

    @Override
    public void insert(FavoritesEntity favorites) {
        favoritesDAO.insert(favorites);
    }

    @Override
    public void update(FavoritesEntity favorites) {
        favoritesDAO.update(favorites);
    }
    @Override
    public void delete(Integer favoritesid) throws Exception {
        favoritesDAO.delete(favoritesid);
    }


    @Override
    public FavoritesEntity findById(Integer favoritesid) {
        return favoritesDAO.findById(favoritesid);
    }

    @Override
    public List<FavoritesEntity> findAll() {
        return favoritesDAO.findAll();
    }


    @Override
    public List<FavoritesEntity> findAll(Integer page, Integer pageSize) {
        return favoritesDAO.findAll(true, page ,pageSize);
    }

    @Override
    public Integer count() {
        return favoritesDAO.countAll().intValue();
    }
}
