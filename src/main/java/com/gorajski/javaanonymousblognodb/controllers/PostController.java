package com.gorajski.javaanonymousblognodb.controllers;

import com.gorajski.javaanonymousblognodb.models.Post;
import com.gorajski.javaanonymousblognodb.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    @RequestMapping("/")
    public String postIndex(ModelMap map) {
        List<Post> posts = PostRepository.allPosts();
        map.put("posts", posts);
        return "index";
    }

    @RequestMapping(value="/posts", method=RequestMethod.POST)
    public String postCreate(@RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("body") String body) {
        PostRepository.createPost(title, author, body);
        String str = body;
        return "redirect:/";
    }

    @RequestMapping("/posts/{id}")
    public String postShow(@PathVariable int id, ModelMap map) {
        map.put("post", PostRepository.findPostById(id));
        return "show";
    }

    @RequestMapping("/posts/new")
    public String postNew() {
        return "new";
    }
}