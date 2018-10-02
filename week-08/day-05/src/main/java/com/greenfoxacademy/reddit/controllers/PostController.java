package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositoires.PostRepository;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class PostController {

    private PostRepository postRepository;
    private PostService postService;

    public PostController(PostRepository postRepository, PostService postService) {
        this.postRepository = postRepository;
        this.postService = postService;
    }

    @GetMapping("/submit")
    public String getPost(){

        return "form";
    }
    @PostMapping("/submit")
    public String submitPost(@RequestParam("title") String title, @RequestParam("url") String url){
        if(title.isEmpty() || url.isEmpty()){
            return "form";
        }

        Post newPost = new Post();
        newPost.setTitle(title);
        newPost.setUrl(url);
        newPost.setCreatedAt(LocalDateTime.now());
        postRepository.save(newPost);

        return "redirect:/main";
     }




}
