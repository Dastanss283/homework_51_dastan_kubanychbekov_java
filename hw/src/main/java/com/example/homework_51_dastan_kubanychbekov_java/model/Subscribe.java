package com.example.homework_51_dastan_kubanychbekov_java.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Subscribe {

    @Id
    private String id;
    private List<User> user = new ArrayList<>();
    private LocalDate date;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public List<User> getUser() {
        return user;
    }
    public void setUser(List<User> user) {
        this.user = user;
    }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}