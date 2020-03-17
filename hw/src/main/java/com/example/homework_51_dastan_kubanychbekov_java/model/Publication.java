package com.example.homework_51_dastan_kubanychbekov_java.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Publication {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final Random r = new Random();

    @Id
    private String id;
    private String img;
    private String description;
    private LocalDate date;
    private int likes;
    @DBRef
    private User user;

    public Publication(String id, String description, int likes, User user) {
        this.id = id;
        this.description = description;
        this.likes = likes;
        this.user = user;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getImg() { return img; }
    public void setImg(String img) { this.img = img; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public int getLikes() { return likes; }
    public void setLikes(int likes) { this.likes = likes; }


    private String generateId() {
        return date.now().format(dtf) + r.nextInt();
    }

    public static Publication makePublication(String img , String description, LocalDate date) {
        Publication pub = new Publication();
        pub.setImg(img);
        pub.setDescription(description);
        pub.setDate(date);
        return pub;
    }
}