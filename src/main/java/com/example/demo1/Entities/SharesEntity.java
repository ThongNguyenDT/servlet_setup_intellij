package com.example.demo1.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "shares", schema = "111023", catalog = "")
public class SharesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ShareId", nullable = false)
    private Integer shareId;
    @Basic
    @Column(name = "Email", nullable = true, length = 50)
    private String email;


    @Basic
    @Column(name = "ShareDate", nullable = true)
    private Date shareDate;
    @Basic
    @Column(name = "Username", nullable = true, length = 50)
    private String username;
    @Basic
    @Column(name = "VideoId", nullable = true)
    private Integer videoId;

    public SharesEntity() {
        super();
    }

    public SharesEntity(String email, Date shareDate, String username, Integer videoId) {
        this.email = email;
        this.shareDate = shareDate;
        this.username = username;
        this.videoId = videoId;
    }

    public Integer getShareId() {
        return shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getShareDate() {
        return shareDate;
    }

    public void setShareDate(Date shareDate) {
        this.shareDate = shareDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SharesEntity that = (SharesEntity) o;

        if (shareId != null ? !shareId.equals(that.shareId) : that.shareId != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (shareDate != null ? !shareDate.equals(that.shareDate) : that.shareDate != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (videoId != null ? !videoId.equals(that.videoId) : that.videoId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shareId != null ? shareId.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (shareDate != null ? shareDate.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (videoId != null ? videoId.hashCode() : 0);
        return result;
    }
}
