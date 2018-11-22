package facade;

import entity.CandyType;
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
    public void setUp() throws Exception {
    }
    


    @Test
    @Disabled
    public void testAddCandy() {
//        CandyType ct = new CandyType("JUnitStrawberry");
//        cf.addCandy(ct);
//        
//        CandyType checkCandy = cf.findCandyById(2);
//        assertNotNull(true);
    }

    @Test
    //@Disabled
    public void testFindCandyById()
    {
        CandyType ct = cf.findCandyById(2);
        assertNotNull(ct);
    }
}
