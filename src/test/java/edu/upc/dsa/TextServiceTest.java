package edu.upc.dsa;
package edu.upc.eetac.dsa.services;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiOperation;
import models.User;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/GameManager", description = "Endpoint to User Service")
@Path("/GameManager")

public class ManagerService {

    static final Logger logger = Logger.getLogger(ManagerService.class);

    private GameManager manager;

    public ManagerService() {

        PropertyConfigurator.configure("src/main/resources/log4j.properties");

        this.manager = GameManager.getInstance();

        models.User usuario1 = new User("1", "Javier", "Márquez", "Javier@gmail.com");
        this.manager.RegistrarUsuario(usuario1);
    }
}

    @GET
    @ApiOperation(value = "Get all usuarios", notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Usuario.class, responseContainer = "List"),
    })
    @Path("/Usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsuarios() {

        List<models.User> usuario = this.manager.getListaDeUsuarios();
        GenericEntity<List<models.User>> entity = new GenericEntity<List<models.User>>(usuario) {
        };
        return Response.status(201).entity(entity).build();
    }

    @GET
    @ApiOperation(value = "Get all objetos", notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Objeto.class, responseContainer = "List"),
    })

}
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TextServiceTest {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp() throws Exception {
        // start the server
        server = Main.startServer();
        // create the client
        Client c = ClientBuilder.newClient();

        // uncomment the following line if you want to enable
        // support for JSON in the client (you also have to uncomment
        // dependency on jersey-media-json module in pom.xml and Main.startServer())
        // --
        // c.configuration().enable(new org.glassfish.jersey.media.json.JsonJaxbFeature());

        target = c.target(Main.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }


    @Test
    public void testGetIt() {
        String responseMsg = target.path("myresource").request().get(String.class);
        assertEquals("Got it!", responseMsg);
    }
}
