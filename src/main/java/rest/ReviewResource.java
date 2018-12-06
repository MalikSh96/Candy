/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Reviews;
import entity.Shop;
import exceptions.NotFoundException;
import facade.ReviewFacade;
import facade.ShopFacade;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Jollys
 */
@Path("review")
public class ReviewResource {
    
    @Context
    private UriInfo context;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private ReviewFacade rf = new ReviewFacade();

    public ReviewResource() {
    }
    
    @POST //with a sematic url parameter
    @Produces(MediaType.APPLICATION_JSON)
    public Response addReviews(String js) throws NotFoundException {
        System.out.println("js" + js);
        Reviews r = gson.fromJson(js, Reviews.class);
        System.out.println(r);
        ShopFacade sf = new ShopFacade();
        Shop shop = sf.getShopById(r.getShop().getId());
        r.setShop(shop);
        shop.addReview(r);
        rf.addReview(r);
        System.out.println(gson.fromJson(js, Reviews.class));
        r.setShop(null);
        return Response.ok().entity(gson.toJson(r)).build();
        
    }
    
     @GET
    @Path("{id}") //with a sematic url parameter
    @Produces(MediaType.APPLICATION_JSON)
    public String getReviewoutWithId(@PathParam("id") int id) throws NotFoundException {
        List<Reviews> r = rf.getAllReviewsForOneShop(id);
        if (r == null) {
            throw new NotFoundException("Can't found candy");
        }
        return gson.toJson(r);
       
    }
}
