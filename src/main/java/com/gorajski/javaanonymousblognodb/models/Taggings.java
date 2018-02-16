package com.gorajski.javaanonymousblognodb.models;

public class Taggings {
    private static int lastId = 0;

    private int id;
    private int postId;
    private int tagId;

    public Taggings(int postId, int tagId) {
        this.id = ++lastId;
        this.postId = postId;
        this.tagId = tagId;
    }
}
