package edu.upc.dsa;
import edu.upc.dsa.models.User;
import edu.upc.dsa.models.Game;
import edu.upc.dsa.models.Match;

import java.util.List;

public interface GameManager {
    void RegistrarUsuario(User user);
    List<User> getListaDeUsuarios();
    int IniciarSesion(String mail, String Password);
    public int numUsers();
    public void addUser(String userId, User user);
    public void createGame (String idgame, String description, int level);

    void addUser(String iduser, String user);

    List<Game> addGame(String idgame, String description, int level);

    public void createMatch (String idmatch, String iduser, String date);

    void addMatch(String idmatch, String iduser, String date);

    public int getPoints (String iduser);
    public int getLevel (String idUser);
    public void UpLevel (String idUser, String idmatch, String date);
    public int getUser(String idUser);



}

