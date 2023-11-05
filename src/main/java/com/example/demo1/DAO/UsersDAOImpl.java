package com.example.demo1.DAO;

import com.example.demo1.DAO.AbstractDAO.AbstractDao;

import com.example.demo1.Entities.UsersEntity;
import com.example.demo1.JPAConfig.JPAConfig;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UsersDAOImpl extends AbstractDao<UsersEntity> {
    public UsersDAOImpl() {
        super(UsersEntity.class);
    }
    public UsersEntity findByName(String Name) {
        EntityManager enma = JPAConfig.getEntityManager();
        UsersEntity entity = enma.find(UsersEntity.class, Name);

        return entity;
    }
}
