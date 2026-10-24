package com.tesing.tesing.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "users") //Collection users in mongoDB
public class User {

    @Id //(_id primary key in mongoDB)
    private String id;
    private String name;
    private int age;

    public User(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}