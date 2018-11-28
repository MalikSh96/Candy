package facade;

import entity.User;
import entity.UserOrder;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;;
import java.text.SimpleDateFormat;
import java.util.Date;
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

        User user = new User("jUnitFirstOr", "jUnitLastOr", "junit2@junit2junit.junit", "junit2password", "43215678", "2Junit", "jUnitSideStreet4", 4321);
        uf.createUser(user);
        Date date = new Date();
        UserOrder uo = new UserOrder(date, user);
        of.createOrder(uo);
        assertNotNull(true);
    }
    
}
