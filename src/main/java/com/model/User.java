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
    public String getMail(){
        return email;
    }
    public void setEmail(string email){
        this.email = email;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(string password){
        this.password = password;
    }
      public String role(){
        return role;
    }
    public void role(string role){
        this.role = role;
    }
}