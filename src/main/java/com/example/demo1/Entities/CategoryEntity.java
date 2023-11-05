package com.example.demo1.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "category", schema = "111023", catalog = "")
@NamedQuery(name = "category.findAll", query = "SELECT c FROM category c")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CategoryID", nullable = false)
    private int categoryId;
    @Basic
    @Column(name = "CategoryName", nullable = true, length = 100)
    private String categoryName;
    @Basic
    @Column(name = "Categorycode", nullable = true, length = 100)
    private String categorycode;
    @Basic
    @Column(name = "Image", nullable = true, length = 500)
    private String image;
    @Basic
    @Column(name = "Status", nullable = true)
    private Boolean status;

    public CategoryEntity() { super();}

    public CategoryEntity(String categoryName, String categorycode, String image, Boolean status) {
        this.categoryName = categoryName;
        this.categorycode = categorycode;
        this.image = image;
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategorycode() {
        return categorycode;
    }

    public void setCategorycode(String categorycode) {
        this.categorycode = categorycode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (categoryId != that.categoryId) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (categorycode != null ? !categorycode.equals(that.categorycode) : that.categorycode != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (categorycode != null ? categorycode.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
