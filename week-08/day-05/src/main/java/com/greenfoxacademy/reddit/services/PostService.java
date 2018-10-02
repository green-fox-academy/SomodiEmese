package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

public interface PostService {

    void upVote(long id);

    void downVote(long id);
}
