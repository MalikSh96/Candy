package facade;

import entity.Role;
import entity.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;

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
    @Disabled
    public void testGetInstance() {
    }

    @Test
    @Disabled
    public void testGetVerifiedUser() throws Exception {
    }

    @Test
    //@Disabled
    public void testCreateUser() {
        Role userRole = new Role("user");
        User user = new User("jUnitFirst", "jUnitLast", "jUnit@jUnit.jUnit", "junittest", "12345678", "jUnitStreet 2400");
        user.addRole(userRole);
        uf.createUser(user);
        
        User checkUser = uf.findUser("jUnit@jUnit.jUnit");
        assertNotNull(checkUser);
    }


    @Test
    @Disabled
    public void testFindUser() {
    }
    
}
