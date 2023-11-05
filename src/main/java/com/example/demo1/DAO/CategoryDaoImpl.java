package com.example.demo1.DAO;

import com.example.demo1.DAO.AbstractDAO.AbstractDao;
import com.example.demo1.Entities.CategoryEntity;
import com.example.demo1.JPAConfig.JPAConfig;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CategoryDaoImpl extends AbstractDao<CategoryEntity> {

    public CategoryDaoImpl() {
        super(CategoryEntity.class);
    }
    public List<CategoryEntity> findByCategoryName(String categoryName) {
        EntityManager enma = JPAConfig.getEntityManager();
        String jpql = "SELECT c FROM Category c WHERE c.CategoryName like :categoryName";
        TypedQuery<CategoryEntity> query = enma.createNamedQuery(jpql, CategoryEntity.class);
        query.setParameter("categoryName", "%" + categoryName + "%");
        return query.getResultList();
    }
}
