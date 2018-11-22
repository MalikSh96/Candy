package facade;


import entity.Role;
import entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 * @author malik
 */
public class UserFacadeTest {
    
    private UserFacade uf = new UserFacade();
    
    public UserFacadeTest() {
    }

    @Before
    public void setUp() throws Exception {
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
    @Disabled
    public void testCreateUser() {
        Role userRole = new Role("user");
        User user = new User("jUnitFirst", "jUnitLast", "jUnit@jUnit.jUnit", "junittest", "12345678", "JUnitHagen", "jUnitStreet 2.th", 1234);
        user.addRole(userRole);
        uf.createUser(user);
        
        User checkUser = uf.findUser("jUnit@jUnit.jUnit");
        assertNotNull(checkUser);
    }

    @Test
    @Disabled
    public void testFindUser() {
        User u = uf.findUser("jUnit@jUnit.jUnit");
        assertNotNull(u);
    }

    @Test
    @Disabled
    public void testEditUser() {
        User u = uf.findUser("jUnit@jUnit.jUnit");
        System.out.println("first " + u.getBalance());
        u.setBalance(100);
        uf.editUser(u);
        int actual = u.getBalance();
        int expected = 100;
        System.out.println("last " + u.getBalance());
        Assert.assertEquals(expected, actual);
    }

    @Test
    @Disabled
    public void testGetAllUsers() {
        int expected = 2;
        int actual = uf.getAllUsers().size();
        System.out.println("size " + uf.getAllUsers());
        Assertions.assertEquals(expected, actual);
    }
    
}
