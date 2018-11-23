/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.CandyType;
import entity.Shop;
import exceptions.NotFoundException;
import facade.CandyFacade;
import facade.ShopFacade;
import java.io.IOException;
import java.net.MalformedURLException;
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
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import mappers.CandyInfo;
import mappers.ShopInfo;

/**
 * REST Web Service
 *
 * @author Jollys
 */
@Path("candy")
public class CandyResource {

    @Context
    private UriInfo context;

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private CandyFacade cf;
    // private ShopInfo si;
    private CandyType candy;
    private CandyInfo candyInfo;

    /**
     * Creates a new instance of ShopResource
     */
    public CandyResource() {
        cf = new CandyFacade();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");

    }

    @GET
    @Path("{id}") //with a sematic url parameter
    @Produces(MediaType.APPLICATION_JSON)
    public String getCandyById(@PathParam("id") int id) throws NotFoundException {
        CandyType p = cf.findCandyById(id);
//        if (p == null) {
//            throw new WebApplicationException(Response.Status.NOT_FOUND); //look for 404 not found in the browser.
//        }

        if (p == null) {
            throw new NotFoundException("Can't found candy");
        }
        return gson.toJson(p);
        //Response.ok().entity(JSONConverter.getJSONFromPerson());
    }

    

 
    private class Call implements Callable<CandyInfo> {
        
        private CandyFacade cf;
        private final CandyType candyName;
      
        public Call(CandyType candyName) {
            this.candyName = candyName;
            
        }

        @Override
        public CandyInfo call() throws Exception {
            candyInfo = new CandyInfo(candyName);
            return candyInfo;
        }
    }
    
    @GET
    @Path("/allcandy")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAmountpoul() throws NotFoundException, InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<CandyInfo>> list = new ArrayList<>();
        //StringBuilder builder = new StringBuilder();
       
        for(int i = 1; i <= 2; i++){
            Callable<CandyInfo> callable = new Call(cf.findCandyById(i));
            Future<CandyInfo> future = executorService.submit(callable);
            list.add(future);
        }
        List<CandyInfo> candyList = new ArrayList();
        
        for (int i = 0; i < list.size(); i++) {
            CandyInfo result = list.get(i).get();
            candyList.add(result);
        }
        
        
        return gson.toJson(candyList);

    }
    public static void main(String[] args) {
         CandyFacade cf = new CandyFacade();
     
        System.out.println(cf.findCandyById(1));
        System.out.println(cf.findCandyById(2));
    }
}

