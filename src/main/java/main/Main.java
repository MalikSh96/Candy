package main;

import entity.Reviews;
import entity.Shop;
import facade.ReviewFacade;
import facade.ShopFacade;

/**
 *
 * @author malik
 */
public class Main {
    public static void main(String[] args) {
        //----------------------------------------------------------------------
        //UserFacade
//        UserFacade facade = new UserFacade();
//        Role userRole = new Role("user");
//        User user = new User("mainF", "mainL", "main@main.main", "hellofrommain", "123456789", "CityHus", "mainstreet 1.tv", "2100");
//        user.addRole(userRole);
//        System.out.println("CreateUser: " + facade.createUser(user));

        //----------------------------------------------------------------------
        //CandyFacade
//        CandyFacade cfacade = new CandyFacade();
//        CandyType type = new CandyType("mainJordbær");
//        System.out.println("CreateCandy: " + cfacade.addCandy(type));


        //----------------------------------------------------------------------
        //OrderFacade
//        OrderFacade of = new OrderFacade();
//        UserOrder uo = new UserOrder(user);
//        System.out.println("of " + of.createOrder(uo));
        
        
        
        //----------------------------------------------------------------------
        //Orderline facade
//        OrderlineFacade olf = new OrderlineFacade();
//        Orderline ol = new Orderline(10, cfacade.findCandyById(1));
//        olf.createOrderline(ol);
        
        
        //----------------------------------------------------------------------
        //ShopFacade
        ShopFacade sf = new ShopFacade();

//        System.out.println("Find by zip " + sf.getShopsByPostalCode(4321));


        //----------------------------------------------------------------------
        ReviewFacade rf = new ReviewFacade();
//        Shop s = sf.getShopById(3);
//        Reviews r = new Reviews(s, "Main good", 3);
//        Reviews r = new Reviews("Main, good candy", 5);
//        r.setShop(s);
//        s.addReview(r);
//        
//        rf.addReview(r);
        System.out.println("List reviews " + rf.getAllReviewsForOneShop(1));
        
    }
}
