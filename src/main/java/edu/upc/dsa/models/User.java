package edu.upc.dsa.models;

import java.util.*;
public class User {
    private String name;
    private String surname;
    private String iduser;
    private String mail;
    private String password;
    int points;

    private List<User> usersList = new ArrayList<>();


    // Constructor
    public User(String idUser, String name) {
        this.iduser = idUser;
        this.name = name;
    }
    private List<User> userList = new ArrayList<>();

    public String getUserId(){
        return iduser;
    }
    public void setUserId(String id){
        this.iduser=id;
    }


}