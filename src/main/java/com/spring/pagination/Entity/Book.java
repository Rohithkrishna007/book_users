package com.spring.pagination.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    private long id;
    private  String title;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    public Book() {
    }

    public Book(long id, String title, User user) {
        this.id = id;
        this.title = title;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
