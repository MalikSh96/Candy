package main;

import entity.CandyType;
import entity.Role;
import entity.User;
import facade.CandyFacade;
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
        CandyFacade cfacade = new CandyFacade();
        CandyType type = new CandyType("mainJordbær");
        System.out.println("CreateCandy: " + cfacade.addCandy(type));
    }
    
}
