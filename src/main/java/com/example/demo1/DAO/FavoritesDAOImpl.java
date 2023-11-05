package com.example.demo1.DAO;

import com.example.demo1.DAO.AbstractDAO.AbstractDao;
import com.example.demo1.Entities.FavoritesEntity;

public class FavoritesDAOImpl  extends AbstractDao<FavoritesEntity> {

    public FavoritesDAOImpl() {
        super(FavoritesEntity.class);
    }
}
