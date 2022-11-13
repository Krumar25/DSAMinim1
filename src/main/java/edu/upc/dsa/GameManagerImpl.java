package edu.upc.dsa;
import edu.upc.dsa.models.User;
import edu.upc.dsa.models.Game;
import edu.upc.dsa.models.Match;
import org.apache.log4j.Logger;
import java.util.LinkedList;
import java.util.List;

public class GameManagerImpl implements GameManager {
    private static GameManager instance;
    protected List<Game> games;
    protected List<Match> matches;
    protected List<String> users;
    final static Logger logger = Logger.getLogger(GameManagerImpl.class);

    private GameManagerImpl() {
        this.users = new LinkedList<String>();
    }

    public static GameManager getInstance() {
        if (instance==null) instance = new GameManagerImpl();
        return instance;
    }

    public int size() {
        int ret = this.users.size();
        logger.info("size " + ret);

        return ret;
    }

    public List<String> findAll() {
        return this.users;
    }

   @Override
    public void RegistrarUsuario(User user) {

    }

    @Override
    public List<User> getListaDeUsuarios() {
        return null;
    }

    @Override
    public int IniciarSesion(String mail, String Password) {
        return 0;
    }

    @Override
    public int numUsers() {
        return 0;
    }

    @Override
    public void addUser(String userId, User user) {

    }
    @Override
    public void addUser(String idUser, String name) {
        logger.info("New user" + idUser +"name" + users);
        User user = new User(idUser,name);
        this.users.add(name);
        logger.info("User created " + user);
    }

    @Override
    public void createGame(String idgame, String description, int level) {

    }
    @Override
    public List<Game> addGame(String idgame, String description, int level) {
        logger.info("New game" +idgame+ " , description " + description + ", level " + level);
        Game newgame = new Game(idgame, description, level);
        this.games.add(newgame);
        logger.info("Game created " + newgame);
        return games;
    }

    @Override
    public void createMatch(String idmatch, String iduser, String date) {

    }

    @Override
    public void addMatch(String idmatch, String iduser, String date) {

    }

    @Override
    public int getPoints(String idUser) {
        int res;
        Match points = new Match();
        if(users.contains(idUser))
        {
            logger.info("User with id: " + idUser + "is in a match");
            res = points.getPoints();
        }
        else
        {
            logger.error("User doesn't exit");
            res = -1;
        }
        return res;
    }

    @Override
    public int getLevel (String idUser) {
        int user = getUser(idUser);
        Match match = new Match();
        logger.info("getLevel(" + idUser + ")");
        if (users.contains(idUser))
            logger.info("User " + idUser + " exist");
        logger.info("User" + idUser + "playing " + match.getLevel() + "match  with match id" + match.getIdMatch());
return 0;

    }

    @Override
    public void UpLevel(String iduser, String idmatch, String date) {

    }

    @Override
    public int getUser(String idUser) {
        return 0;
    }
}