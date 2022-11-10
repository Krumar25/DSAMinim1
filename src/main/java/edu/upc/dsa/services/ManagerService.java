package edu.upc.dsa.services;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import models.User;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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

        this.manager = GameManagerImpl.getInstance();

        User usuario1 = new User("1", "Javier", "Márquez", "Javier@gmail.com");

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
        GenericEntity<List<User>> entity = new GenericEntity<List<Usuario>>(usuario) {
        };
        return Response.status(201).entity(entity).build();
    }
}