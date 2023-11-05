package com.example.demo1.Sevice.User;

import com.example.demo1.Entities.UsersEntity;

import java.util.List;

public interface IUsersService {
    void insert(UsersEntity user);

    void update(UsersEntity user);

    void delete(Integer username) throws Exception;

    UsersEntity findByName(String name);

    List<UsersEntity> findAll();

    List<UsersEntity> findAll(Integer page, Integer pageSize);

    Integer count();
}
