package main;

import entity.Role;
import entity.User;
import facade.UserFacade;

/**
 *
 * @author malik
 */
public class Main {
    public static void main(String[] args) {
        UserFacade facade = new UserFacade();
        Role userRole = new Role("user");
        User user = new User("mainF", "mainL", "main@main.main", "hellofrommain", "123456789", "CityHus", "mainstreet 1.tv", "2100");
        user.addRole(userRole);
        System.out.println("CreateUser: " + facade.createUser(user));
    }
    
}
