package com.example.homework_51_dastan_kubanychbekov_java.util;
import kz.attractor.microgram.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Configuration
public class DatabasePreloader {
    public final UserRepository ur;
    public final PublicationRepository pr;
    public final LikeRepository lr;
    public final CommentRepository cr;
    public final SubscribeRepository sr;
    LocalDate date = LocalDate.now();

    public DatabasePreloader(UserRepository ur, PublicationRepository pr, LikeRepository lr, CommentRepository cr, SubscribeRepository sr) {
        this.ur = ur;
        this.pr = pr;
        this.lr = lr;
        this.cr = cr;
        this.sr = sr;
        User user1 = new User("rua", "rua@mail.com", "qqw", date);



    }
    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        repository.deleteAll();
        return (args) -> Stream.of(users())
                .peek(System.out::println)
                .forEach(repository::save);
    }

    private User[] users() {
        return new User[]{
                new User("rua", "rua@mail.com", "qqw", date),
                new User("tj", "tj@mail.com", "qqw", date),
                new User("cody", "cody@mail.com", "qqw", date),
                new User("raphael", "motherfucker@mail.com", "qqw", date)};
    }

    private Publication[] publications(){
        User user1 = new User("rua", "rua@mail.com", "qqw", date);
        User user2 = new User("gh", "rua@mail.com", "qqw", date);
        User user3 = new User("tj", "rua@mail.com", "qqw", date);
        return new Publication[]{
                new Publication("1", "post1", 20, user1),
                new Publication("2", "post2", 10, user2),
                new Publication("3", "post3", 25, user3)
        };
    }
}
