package com.example.homework_51_dastan_kubanychbekov_java.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Document
@Data
public class User {
    private static final Random r = new Random();
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static String generateId() {
        return LocalDateTime.now().format(dtf) + r.nextInt();
    }

    @Id
    private String id;
    private String account;
    private String mail;
    private String password;
    private int qty;
    private int subscribes;
    private int subscribers;


    public int getSubscribes() { return subscribes; }
    public void setSubscribes(int subscribes) { this.subscribes = subscribes; }
    public int getSubscribers() { return subscribers; }
    public void setSubscribers(int subscribers) { this.subscribers = subscribers; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getAccount() { return account; }
    public void setAccount(String account) { this.account = account; }
    public void setMail(String mail) { this.mail = mail; }
    public String getMail() { return mail; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    private static String generateId(LocalDate date) {
        return date.atTime(LocalTime.now()).format(dtf) + "-" + r.nextInt(1_000_000);
    }


    public User(String account, String mail, String password, LocalDate date) {
        this.account = account;
        this.mail = mail;
        this.password = password;
        this.setId(generateId(date));
    }

    public String toString(){ return account+" "+mail+" "+password+" ";}
}
