package com.example.homework_51_dastan_kubanychbekov_java.service;

import com.example.homework_51_dastan_kubanychbekov_java.model.Comment;
import com.example.homework_51_dastan_kubanychbekov_java.model.CommentRepository;
import com.example.homework_51_dastan_kubanychbekov_java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CommentService {
    @Autowired
    CommentRepository repository;
    public Iterable<User> getAllComments() {
        return repository.findAll();


    }
    public Comment getCommentById(String id){
        return (Comment) repository.findAllById(Collections.singleton(id));

    }
}
