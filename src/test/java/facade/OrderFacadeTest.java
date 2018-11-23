package facade;

import entity.User;
import entity.UserOrder;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;;

/**
 *
 * @author malik
 */
public class OrderFacadeTest {
    
    private OrderFacade of = new OrderFacade();
    private UserFacade uf = new UserFacade();
    
    public OrderFacadeTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    @Disabled
    public void testCreateOrder() {
        User user = new User("jUnitFirst", "jUnitLast", "junit@junitjunit.junit", "junitpassword", "43215678", "Jnit", "jUnitSideStreet", 4321);
        uf.createUser(user);
        UserOrder uo = new UserOrder(user);
        of.createOrder(uo);
        assertNotNull(true);
    }
    
}
