package com.example.demo1.Sevice.Share;

import com.example.demo1.Entities.SharesEntity;

import java.util.List;

public interface ISharesService {
    void insert(SharesEntity share);

    void update(SharesEntity share);

    void delete(Integer cateid) throws Exception;

    SharesEntity findById(Integer shareid);

    List<SharesEntity> findAll();

    List<SharesEntity> findAll(Integer page, Integer pageSize);

    Integer count();
}
