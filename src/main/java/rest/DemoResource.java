package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.UserInfo;
import entity.User;
import facade.UserFacade;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

/**
 * REST Web Service
 *
 * @author lam@cphbusiness.dk
 */
@Path("info")
public class DemoResource {

    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    UserFacade uf;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("user")
    @RolesAllowed("user")
    public String getFromUser() {
        String User = securityContext.getUserPrincipal().getName();
        System.out.println("Poul: " + User);

        
        return "\"Hello from User " + User + "\"";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("admin")
    @RolesAllowed("admin")
    public String getFromAdmin() {
        String User = securityContext.getUserPrincipal().getName();

        return "\"Hello from ADMIN qwert " + User + "\"";
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("user/email")
//    @RolesAllowed("user")
//    public String FindUser() {
//        String User = securityContext.getUserPrincipal().getName();
//        System.out.println("Lars: " + User);
//       
//
//        System.out.println("User:" + user);
//        return gson.toJson(user);
//
//    }

}
