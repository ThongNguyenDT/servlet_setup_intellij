package com.example.demo1.DAO;

import com.example.demo1.DAO.AbstractDAO.AbstractDao;
import com.example.demo1.Entities.VideosEntity;

public class VideosDAOImpl extends AbstractDao<VideosEntity> {
    public VideosDAOImpl() {
        super(VideosEntity.class);
    }
}
