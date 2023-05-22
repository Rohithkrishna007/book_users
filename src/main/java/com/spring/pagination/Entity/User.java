package com.spring.pagination.Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "users")
public class User  {

    @Id
    @GeneratedValue
    private  long userid;
    private String name;
    private String mail;
    private String phone;
    private String role;

    public User() {
    }

    public User(long userid, String name, String mail, String phone, String role) {
        this.userid = userid;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.role = role;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
