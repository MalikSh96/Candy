package main;

import entity.CandyType;
import entity.Orderline;
import entity.Role;
import entity.Shop;
import entity.User;
import entity.UserOrder;
import facade.CandyFacade;
import facade.OrderFacade;
import facade.OrderlineFacade;
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
//        UserFacade facade = new UserFacade();
//        Role userRole = new Role("user");
//        User user = new User("mainF", "mainL", "main@main.main", "hellofrommain", "123456789", "CityHus", "mainstreet 1.tv", "2100");
//        user.addRole(userRole);
//        System.out.println("CreateUser: " + facade.createUser(user));

        //----------------------------------------------------------------------
        //CandyFacade
//        CandyFacade cfacade = new CandyFacade();
//        CandyType type = new CandyType("mainJordbær");
//        System.out.println("CreateCandy: " + cfacade.addShop(type));


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
//        Shop shop = new Shop("mainShop", "mainShopAddress", 3000, 10);
//        Shop shop = new Shop("mainShop2", "mainShopAddress2", 3000, 15);
//        Shop shop = new Shop("mainShop3", "mainAddressShop", 2800, 5);
//        System.out.println("sf " + sf.addShop(shop));

//        System.out.println("Find by zip " + sf.getShopsByPostalCode(1234));
        
    }
    
}
