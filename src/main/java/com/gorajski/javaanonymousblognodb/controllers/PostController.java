package com.gorajski.javaanonymousblognodb.controllers;

import com.gorajski.javaanonymousblognodb.models.Post;
import com.gorajski.javaanonymousblognodb.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostController {

    @RequestMapping("/")
    public String postIndex(ModelMap map) {
        List<Post> posts = PostRepository.allPosts();
        map.put("posts", posts);
        return "index";
    }

    @RequestMapping("/posts/{id}")
    public String postShow(@PathVariable int id, ModelMap map) {
        map.put("post", PostRepository.findPostById(id));
        return "show";
    }

//    @RequestMapping("/posts/new")
//    public String postNew(ModelMap map) {
//        Post post
//    }
}