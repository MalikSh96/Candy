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

public class Main {
    public static void main(String[] args) {
        //----------------------------------------------------------------------
        //UserFacade
        UserFacade facade = new UserFacade();
        Role userRole = new Role("user");
        User user = new User("mainF", "mainL", "main@main.main", "hellofrommain", "123456789", "CityHus", "mainstreet 1.tv", 2100);
        user.addRole(userRole);
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
//        Orderline ol = new Orderline(519, cfacade.findCandyById(1));
//        olf.createOrderline(ol);
        
        
        //----------------------------------------------------------------------
        //ShopFacade
//        ShopFacade sf = new ShopFacade();
//        Shop shop = new Shop("mainShop", "mainShopAddress", 1234, 10);
//        Shop shop1 = new Shop("mainShop2", "mainShopAddress2", 1234, 15);
//        Shop shop2 = new Shop("mainShop3", "mainAddressShop", 4321, 5);
//        System.out.println("sf " + sf.addShop(shop));
//        System.out.println("sf " + sf.addShop(shop1));
//        System.out.println("sf " + sf.addShop(shop2));
//
//        System.out.println("Find by zip " + sf.getShopsByPostalCode(1234));
    //    System.out.println(olf.getAllOrderlines().toString());
    }
    
}
