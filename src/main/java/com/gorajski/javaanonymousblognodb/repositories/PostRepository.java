package com.gorajski.javaanonymousblognodb.repositories;

import com.gorajski.javaanonymousblognodb.models.Post;

import java.util.Arrays;
import java.util.List;

public class PostRepository {
    private static List<Post> posts = Arrays.asList(
            new Post("Chicken Soup", "Glenn Campbell", "It's good for the soul."),
            new Post("Heavy Metal", "Terk Siddiqui", "I love heavy metal.  Makes me feel free to be myself."),
            new Post("Crocheting", "Barry Karlov", "Today we're going to learn a new technique.")
    );

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
}
