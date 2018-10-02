package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositoires.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void upVote(long id){
        Post post = postRepository.findById(id). orElseThrow(IllegalArgumentException::new);
        post.setVote(post.getVote() + 1);

        postRepository.save(post);
    }

    @Override
    public void downVote(long id) {
        Post post = postRepository.findById(id). orElseThrow(IllegalArgumentException::new);
        post.setVote(post.getVote() - 1);

        postRepository.save(post);

    }
}
