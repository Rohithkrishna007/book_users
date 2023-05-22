package com.spring.pagination.dto;

import com.spring.pagination.Entity.Book;
import lombok.Data;

import java.util.List;

@Data
public class BookUserDto {

    private long userid;
    private String name;
    private String mail;
    private String title;

    public BookUserDto(long userid, String name, String mail, String title) {
        this.userid = userid;
        this.name = name;
        this.mail = mail;
        this.title = title;
    }

    public BookUserDto() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String
    toString() {
        return "BookUserDto{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
