package com.example.demo1.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users", schema = "111023", catalog = "")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Username", nullable = false, length = 50)
    private String username;



    @Basic
    @Column(name = "Password", nullable = true, length = 50)
    private String password;



    @Basic
    @Column(name = "Phone", nullable = true, length = 15)
    private String phone;
    @Basic
    @Column(name = "Fullname", nullable = true, length = 50)
    private String fullname;
    @Basic
    @Column(name = "Email", nullable = true, length = 150)
    private String email;
    @Basic
    @Column(name = "Admin", nullable = true)
    private Boolean admin;
    @Basic
    @Column(name = "Active", nullable = true)
    private Boolean active;
    @Basic
    @Column(name = "Image", nullable = true, length = 50)
    private String image;


    public UsersEntity() {
        super();
    }
    public UsersEntity(String password, String phone, String fullname, String email, Boolean admin, Boolean active, String image) {
        this.password = password;
        this.phone = phone;
        this.fullname = fullname;
        this.email = email;
        this.admin = admin;
        this.active = active;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (fullname != null ? !fullname.equals(that.fullname) : that.fullname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (admin != null ? !admin.equals(that.admin) : that.admin != null) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (admin != null ? admin.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}
