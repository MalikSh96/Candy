/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Role;
import entity.User;
import exceptions.NotFoundException;
import facade.UserFacade;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Jollys
 */
@Path("register")
public class UserResource {

    @Context
    private UriInfo context;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private UserFacade uf = new UserFacade();

    /**
     * Creates a new instance of UserResource
     */
    public UserResource() {
    }

    @POST //with a sematic url parameter
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(String js) throws NotFoundException {
        System.out.println("js" + js);
        Role userRole = new Role("user");
        User u = gson.fromJson(js, User.class);
        u.addRole(userRole);
        u.hashpassword();
        System.out.println("user: " + u);
        uf.createUser(u);
        System.out.println(gson.fromJson(js, User.class));
        return Response.ok().entity(gson.toJson(u)).build();

    }

    @PUT //with a sematic url parameter
    @Path("{email}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response editUser(String js, @PathParam("email") String email) throws NotFoundException {
        User newUser = gson.fromJson(js, User.class);
        User savedUser = uf.findUser(email);
        
        if (savedUser == null) {
            throw new NotFoundException("User not found");
        }
//        savedUser.setPassword(newUser.getPassword());
//        savedUser.hashpassword();

        newUser.hashpassword();
        newUser.setRoleList(savedUser.getRoleList());
//        if (newUser.getEmail() != null) {
//            savedUser.setEmail(newUser.getEmail());
//        }
        
        User user = uf.editUser(newUser);
        
        return Response.ok().entity(gson.toJson(user)).build();
    }
}
//        User u = gson.fromJson(js, User.class);
//        
//        if(u == null)
//        {
//            System.out.println("Not a user " + email);
//        }
//        
//        if (u.getEmail() != null) {
//            uf.editUser(u);
//            //saveUser.setEmail(u.getEmail());
//        }
//        
////        User saveUser = uf.findUser(email);
////        if (saveUser == null) {
////            System.out.println("can't not found user "  + email);
////        }
//
//
////        u.hashpassword();
//        System.out.println("user: " + u);
////        uf.editUser(u);
//        System.out.println(gson.fromJson(js, User.class));
//        return Response.ok().entity(gson.toJson(u)).build();
