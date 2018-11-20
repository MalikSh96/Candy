/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Role;
import entity.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author malik
 */
public class UserFacadeTest {
    
    private UserFacade uf = new UserFacade();
    
    public UserFacadeTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testGetInstance() {
    }

    @Test
    public void testGetVerifiedUser() throws Exception {
    }

    @Test
    public void testCreateUser() {
        Role userRole = new Role("user");
        User user = new User("jUnitFirst", "jUnitLast", "jUnit@jUnit.jUnit", "junittest", "12345678", "jUnitStreet 2400");
        user.addRole(userRole);
        uf.createUser(user);
        
        User checkUser = uf.findUser("jUnit@jUnit.jUnit");
        assertNotNull(checkUser);
    }

    @Test
    public void testFindUser() {
    }
    
}
