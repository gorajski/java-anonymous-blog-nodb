package com.gorajski.javaanonymousblognodb.models;

public class Tag {
    private static int lastId = 0;

    private int id;
    private String name;

    public Tag(String name) {
        this.id = ++lastId;

        this.name = name;
    }
}
