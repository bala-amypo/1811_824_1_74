package com.example.demo.model;

public class User{
    private long id;
    private String name;
    private String email;
    private String password;
    private String role;
    

    public long getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}