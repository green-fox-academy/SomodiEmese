package com.greenfoxacademy.reddit.repositoires;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
