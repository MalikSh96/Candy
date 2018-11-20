/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.CandyType;
import entity.User;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 * @author malik
 */
public class CandyFacadeTest {
    
    private CandyFacade cf = new CandyFacade();
    
    public CandyFacadeTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    
    public void testAddCandy() {
        CandyType ct = new CandyType("JUnitChocolate");
        cf.addCandy(ct);
        
        CandyType checkCandy = cf.findCandyById(2);
        assertNotNull(checkCandy);
    }
    
}
