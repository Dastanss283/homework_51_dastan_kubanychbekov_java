package com.example.homework_51_dastan_kubanychbekov_java.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Music {

    @Id
    private String id;
    @Indexed
    private String name;
    @DBRef
    private List<Singer> perfomer;

    public Music(String name, List<Singer> performer) {
        this.name = name;
        this.perfomer = perfomer;
    }



    public List<Singer> getPerfomer() { return perfomer; }
    public void setPerfomer(List<Singer> perfomer) { this.perfomer = perfomer; }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
