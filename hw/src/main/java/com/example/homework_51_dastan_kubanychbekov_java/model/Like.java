package com.example.homework_51_dastan_kubanychbekov_java.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.List;

@Document
@Data
public class Like {
    @Id
    private String id;
    private User user;
    private List<Publication> publication;
    private List<Comment> comment;
    private LocalDate date;

    public String getId() { return id; }public void setId(String id) { this.id = id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}