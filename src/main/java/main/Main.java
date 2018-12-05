package main;

import entity.Role;
import entity.User;
import facade.ReviewFacade;
import facade.ShopFacade;
import facade.UserFacade;

/**
 *
 * @author malik
 */
public class Main {
    public static void main(String[] args) {
        //----------------------------------------------------------------------
        //UserFacade
        UserFacade facade = new UserFacade();
        Role adminRole = new Role("admin");
        User user = new User("adminFirst", "adminLast", "admin@admin.admin", "adminpass", "123456789", "AdminHus", "adminStreet 1.tv", 2000);
        user.addRole(adminRole);
        System.out.println("CreateUser: " + facade.createUser(user));

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
//        Reviews r = new Reviews("Main, good candy", 5);
//        r.setShop(s);
//        s.addReview(r);
//        
//        rf.addReview(r);
        //System.out.println("List reviews " + rf.getAllRatingsForOneShop(1));
        
//         Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        System.out.println("--- " + rf.getAllRatingsForOneShop(1));
//        UserFacade uf = new UserFacade();
//        User user = uf.findUser("gn@hotmail.com");
//        System.out.println("SSS: " + user);
//        System.out.println(gson.toJson(user));
    }
}
