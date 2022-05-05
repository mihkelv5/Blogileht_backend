package com.Blogsite.Blogsite.post.postRepo;

import com.Blogsite.Blogsite.post.postModel.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepo extends JpaRepository<Post, Long> {

    void deletePostById(Long id);

    Optional<Post> findPostById(Long id);
}