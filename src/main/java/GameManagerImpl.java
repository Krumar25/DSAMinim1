import edu.upc.dsa.models.User;
import models.User;
import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.List;

public class GameManagerImpl implements GameManager {
    private static GameManager instance;
    protected List<models.User> users;
    final static Logger logger = Logger.getLogger(GameManagerImpl.class);

    private GameManagerImpl() {
        this.users = new LinkedList<>();
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

    public List<models.User> findAll() {
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
}