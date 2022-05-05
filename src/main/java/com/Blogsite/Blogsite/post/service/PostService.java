package com.Blogsite.Blogsite.post.service;

import com.Blogsite.Blogsite.post.exceptions.PostNotFoundException;
import com.Blogsite.Blogsite.post.postModel.Post;
import com.Blogsite.Blogsite.post.postRepo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PostService {
    private final PostRepo postRepo;

    @Autowired
    public PostService(PostRepo postRepo){
        this.postRepo = postRepo;
    }

    public Post addPost(Post post){
        return postRepo.save(post);
    }

    public List<Post> findAllPosts(){
        return postRepo.findAll();
    }


    public Post updatePost(Post post){
        return postRepo.save(post);
    }

    public Post findPostById(Long id){
        return postRepo.findPostById(id).orElseThrow(() -> new PostNotFoundException("User by id " + id + " was not found"));
    }

    @Transactional
    public void deletePost(Long id) {
        postRepo.deletePostById(id);
    }

}