package com.example.demo1.Sevice.Share;

import com.example.demo1.DAO.ShareDAOImpl;
import com.example.demo1.Entities.SharesEntity;
import com.example.demo1.Sevice.Share.ISharesService;
import jakarta.inject.Inject;

import java.util.List;

public class SharesServiceImpl implements ISharesService {
    @Inject
    private ShareDAOImpl shareDAO;

    @Override
    public void insert(SharesEntity share) {
        shareDAO.insert(share);
    }

    @Override
    public void update(SharesEntity share) {
        shareDAO.update(share);
    }
    @Override
    public void delete(Integer shareid) throws Exception {
        shareDAO.delete(shareid);
    }


    @Override
    public SharesEntity findById(Integer shareid) {
        return shareDAO.findById(shareid);
    }

    @Override
    public List<SharesEntity> findAll() {
        return shareDAO.findAll();
    }


    @Override
    public List<SharesEntity> findAll(Integer page, Integer pageSize) {
        return shareDAO.findAll(true, page ,pageSize);
    }

    @Override
    public Integer count() {
        return shareDAO.countAll().intValue();
    }
}
