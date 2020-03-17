package com.example.homework_51_dastan_kubanychbekov_java.service;

import com.example.homework_51_dastan_kubanychbekov_java.model.User;
import com.example.homework_51_dastan_kubanychbekov_java.model.UserRepository;
import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAllUser(){
        return (List<User>) userRepository.findAll();
    }
    public void save(User user){
        userRepository.save(user);
    }

}
