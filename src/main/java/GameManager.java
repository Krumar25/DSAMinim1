import java.util.List;
import edu.upc.dsa.models.User;

public interface GameManager {
    void RegistrarUsuario(models.User user);

    List<models.User> getListaDeUsuarios();

    int IniciarSesion(String mail, String Password);

    public int numUsers();

    public void addUser(String userId, models.User user);//


}

