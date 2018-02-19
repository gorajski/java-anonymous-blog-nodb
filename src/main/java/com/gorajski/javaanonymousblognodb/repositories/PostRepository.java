package com.gorajski.javaanonymousblognodb.repositories;

import com.gorajski.javaanonymousblognodb.models.Post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostRepository {
    private static List<Post> posts = new ArrayList<Post>(Arrays.asList(
            new Post("Chicken Soup", "Glenn Campbell", "It's good for the soul."),
            new Post("Heavy Metal", "Terk Siddiqui", "I love heavy metal.  Makes me feel free to be myself."),
            new Post("Crocheting", "Barry Karlov", "Today we're going to learn a new technique.")
    ));

    public static List<Post> allPosts() {
        return posts;
    }

    public static Post findPostById(int id) {
        List<Post> posts = allPosts();
        for(Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public static Post createPost(String title, String author, String body) {
        Post post = new Post(title, author, body);
        posts.add((Post) post);
        return post;
    }

    public static void destroyPost(int id) {
        Post post = findPostById(id);
        posts.remove(post);
    }

    public static void updatePost(int id, String title, String author, String body) {
        Post post = findPostById(id);
        if (title != post.getTitle()) {post.setTitle(title);}
        if (author != post.getAuthor()) {post.setAuthor(author);}
        if (body != post.getBody()) {post.setBody(body);}
    }
}
