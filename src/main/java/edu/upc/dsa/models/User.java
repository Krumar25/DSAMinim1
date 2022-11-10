package models;

import java.util.*;
public class User {
    private String name;
    private String surname;
    private String idUser;
    private String mail;
    private String password;
    int points;

    private List<User> usersList = new ArrayList<>();


    // Constructor
    public User(String idUser, String name, String surname, String mail, String password, int points) {
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.points = 50;
    }
    private List<User> usersList = new ArrayList<>();

    public String getUserId(){
        return idUser;
    }
    public void setUserId(String id){
        this.idUser=id;
    }

    public String getPassword()
    {
        return password;
    }
    public String getMail()
    {
        return mail;
    }

}