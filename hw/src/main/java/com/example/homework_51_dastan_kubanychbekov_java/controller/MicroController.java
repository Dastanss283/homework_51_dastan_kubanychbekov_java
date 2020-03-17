package com.example.homework_51_dastan_kubanychbekov_java.controller;


import com.example.homework_51_dastan_kubanychbekov_java.model.*;
import com.example.homework_51_dastan_kubanychbekov_java.service.UserService;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController {
  @Autowired
    UserService service;

  @GetMapping("/users")
  public List<User> getAllUsers(){
    return (List<User>) service.getAllUser();
  }
}

