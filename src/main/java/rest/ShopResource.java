/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Shop;
import exceptions.NotFoundException;
import facade.ShopFacade;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import dto.ShopInfo;

/**
 * REST Web Service
 *
 * @author Jollys
 */
@Path("shop")
public class ShopResource {

    @Context
    private UriInfo context;

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private ShopFacade sf;
    private ShopInfo ShopInfo;
    private Shop s;

    /**
     * Creates a new instance of ShopResource
     */
    
    //------------------------------------------------------------
    public ShopResource() {
        sf = new ShopFacade();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    }
//--------------------------- where callable get thread -----------------
    private class Call implements Callable<ShopInfo> {

        
        private final Shop ShopName;

        public Call(Shop ShopName) {
            this.ShopName = ShopName;

        }

        @Override
        public ShopInfo call() throws Exception {
            
            ShopInfo = new ShopInfo(ShopName);
            return ShopInfo;
        }
    }
//------------------------Get All shop out -----------------
    @GET
    @Path("/allshop")
    @Produces(MediaType.APPLICATION_JSON)
    public String getallshop() throws NotFoundException, InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<ShopInfo>> list = new ArrayList<>();
        //StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= 3; i++) {
            Callable<ShopInfo> callable = new Call(sf.findShopById(i));
            Future<ShopInfo> future = executorService.submit(callable);
            list.add(future);
        }
        List<ShopInfo> candyList = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            ShopInfo result = list.get(i).get();
            candyList.add(result);
        }

        return gson.toJson(candyList);

    }

 //---------------------- Get shops with posstalcode -------------
    @GET
    @Path("/shoppostalcode/{postalcode}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getshopposstalcode(@PathParam("postalcode") int postalcode) throws NotFoundException, InterruptedException, ExecutionException {

        List<ShopInfo> findOnPostalcode = sf.getShopsByPostalCode(postalcode);
       

        if (findOnPostalcode == null) {
            throw new NotFoundException("Can't found Shop");
        }
        return gson.toJson(findOnPostalcode);
    }

}


