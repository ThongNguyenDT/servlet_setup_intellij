package com.example.demo1.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "videos", schema = "111023", catalog = "")
public class VideosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "VideoId", nullable = false)
    private int videoId;
    @Basic
    @Column(name = "Title", nullable = true, length = 200)
    private String title;
    @Basic
    @Column(name = "Poster", nullable = true, length = 50)
    private String poster;
    @Basic
    @Column(name = "Views", nullable = true)
    private Integer views;
    @Basic
    @Column(name = "Description", nullable = true, length = 500)
    private String description;
    @Basic
    @Column(name = "Active", nullable = true)
    private Boolean active;
    @Basic
    @Column(name = "CategoryId", nullable = true)
    private Integer categoryId;


    public VideosEntity() {
        super();
    }

    public VideosEntity(String title, String poster, Integer views, String description, Boolean active, Integer categoryId) {
        this.title = title;
        this.poster = poster;
        this.views = views;
        this.description = description;
        this.active = active;
        this.categoryId = categoryId;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideosEntity that = (VideosEntity) o;

        if (videoId != that.videoId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (poster != null ? !poster.equals(that.poster) : that.poster != null) return false;
        if (views != null ? !views.equals(that.views) : that.views != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = videoId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (poster != null ? poster.hashCode() : 0);
        result = 31 * result + (views != null ? views.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        return result;
    }
}
