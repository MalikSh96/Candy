/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Orderline;
import entity.User;
import entity.UserOrder;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 * @author malik
 */
public class OrderlineFacadeTest {
    
    OrderlineFacade olf = new OrderlineFacade();
    CandyFacade cf = new CandyFacade();
    UserOrder uo = new UserOrder();
    User u = new User();
    Orderline ol = new Orderline();
    
    public OrderlineFacadeTest() {

    }
    
    @Before
    public void setUp() {
    }

    @Test
    @Disabled
    public void testCreateOrderline() {
        
        Orderline ol = new Orderline(10, cf.findCandyById(1));
        u.setEmail("jUnit@jUnit.jUnit");
        uo.setUser(u);
        ol.setUOrder(uo);
        olf.createOrderline(ol);
        
        
        assertNotNull(ol);
    }
}
