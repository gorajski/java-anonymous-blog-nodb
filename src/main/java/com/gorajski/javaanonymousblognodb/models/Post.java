package com.gorajski.javaanonymousblognodb.models;

public class Post {
    private static int lastId = 0;

    private int id;
    private String title;
    private String author;
    private String body;

    public Post(String title, String author, String body) {
        this.id = ++lastId;
        this.title = title;
        this.author = author;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
