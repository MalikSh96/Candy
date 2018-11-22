/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Orderline;
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
    
    public OrderlineFacadeTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    @Disabled
    public void testCreateOrderline() {
//        Orderline ol = new Orderline(10, cf.findCandyById(1));
//        olf.createOrderline(ol);
//        
//        assertNotNull(ol);
    }
}
