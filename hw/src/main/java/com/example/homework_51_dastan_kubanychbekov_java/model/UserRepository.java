package com.example.homework_51_dastan_kubanychbekov_java.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String > {
    public User findByAccount(String account);
    public User findByMail(String mail);
    public boolean existsByMail(String mail);


}
