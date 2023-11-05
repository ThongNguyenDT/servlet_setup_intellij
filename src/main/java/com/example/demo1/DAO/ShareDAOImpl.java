package com.example.demo1.DAO;

import com.example.demo1.DAO.AbstractDAO.AbstractDao;
import com.example.demo1.Entities.SharesEntity;

public class ShareDAOImpl extends AbstractDao<SharesEntity> {
    public ShareDAOImpl() {
        super(SharesEntity.class);
    }
}
