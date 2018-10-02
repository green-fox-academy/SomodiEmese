package com.greenfoxacademy.reddit.controllers;


import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositoires.PostRepository;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    private PostRepository postRepository;
    private PostService postService;

    public MainController(PostRepository postRepository, PostService postService) {
        this.postRepository = postRepository;
        this.postService = postService;
    }

    @RequestMapping("/main")
    public String seePosts(Model model){
        model.addAttribute("posts", postRepository.findAll());

        return"main";
    }

    @PostMapping("/upvote/{id}")
    public String upVote( @PathVariable long id){
       postService.upVote(id);


        return"redirect:/main";
    }

    @PostMapping("/downvote/{id}")
    public String downVote(@PathVariable long id){
        postService.downVote(id);

        return "redirect:/main";
    }


}
