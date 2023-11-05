package com.example.demo1.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "favorites", schema = "111023", catalog = "")
public class FavoritesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FavoriteId", nullable = false)
    private Integer favoriteId;
    @Basic
    @Column(name = "LikeDate", nullable = true)
    private Date likeDate;
    @Basic
    @Column(name = "VideoId", nullable = true)
    private Integer videoId;
    @Basic
    @Column(name = "Username", nullable = true, length = 50)
    private String username;

    public FavoritesEntity() {
        super();
    }


    public FavoritesEntity(Date likeDate, Integer videoId, String username) {
        this.likeDate = likeDate;
        this.videoId = videoId;
        this.username = username;
    }
    public Integer getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(Integer favoriteId) {
        this.favoriteId = favoriteId;
    }

    public Date getLikeDate() {
        return likeDate;
    }

    public void setLikeDate(Date likeDate) {
        this.likeDate = likeDate;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavoritesEntity that = (FavoritesEntity) o;

        if (favoriteId != null ? !favoriteId.equals(that.favoriteId) : that.favoriteId != null) return false;
        if (likeDate != null ? !likeDate.equals(that.likeDate) : that.likeDate != null) return false;
        if (videoId != null ? !videoId.equals(that.videoId) : that.videoId != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = favoriteId != null ? favoriteId.hashCode() : 0;
        result = 31 * result + (likeDate != null ? likeDate.hashCode() : 0);
        result = 31 * result + (videoId != null ? videoId.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
