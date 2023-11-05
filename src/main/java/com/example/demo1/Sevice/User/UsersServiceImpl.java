package com.example.demo1.Sevice.User;

import com.example.demo1.DAO.UsersDAOImpl;
import com.example.demo1.Entities.UsersEntity;
import jakarta.inject.Inject;

import java.util.List;

public class UsersServiceImpl implements IUsersService {
    @Inject
    private UsersDAOImpl UserDAO;

    @Override
    public void insert(UsersEntity user) {
        UserDAO.insert(user);
    }

    @Override
    public void update(UsersEntity user) {
        UserDAO.update(user);
    }
    @Override
    public void delete(Integer username) throws Exception {
        UserDAO.delete(username);
    }


    @Override
    public UsersEntity findByName(String name ) {
        return UserDAO.findByName(name);
    }

    @Override
    public List<UsersEntity> findAll() {
        return UserDAO.findAll();
    }


    @Override
    public List<UsersEntity> findAll(Integer page, Integer pageSize) {
        return UserDAO.findAll(true, page ,pageSize);
    }

    @Override
    public Integer count() {
        return UserDAO.countAll().intValue();
    }
}
