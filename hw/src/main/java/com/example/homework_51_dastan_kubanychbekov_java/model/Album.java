package com.example.homework_51_dastan_kubanychbekov_java.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Album {

    @Id
    private String id;
    @Indexed
    private String name;
    @DBRef
    private List<Music> song;
    @DBRef
    private List<Singer> perfomer;


    public List<Singer> getPerfomer() { return perfomer; }
    public void setPerfomer(List<Singer> perfomer) { this.perfomer = perfomer; }
    public List<Music> getSong() { return song; }
    public void setSong(List<Music> song) { this.song = song; }
    public String getId() {
        return id;
    }
    public void setId(String id) { this.id = id; }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
