package facade;

import entity.Shop;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 * @author malik
 */
public class ShopFacadeTest {
    
    ShopFacade sf = new ShopFacade();
    
    public ShopFacadeTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    @Disabled
    public void testAddShop() {        
//        Shop shop1 = new Shop("jUnitShop", "jUnitShopStreet", 4321, 10);
//        Shop shop2 = new Shop("jUnitShop2", "jUnitSHopStreet", 4321, 15);
//        Shop shop3 = new Shop("jUnitShop3", "jUnitShopSideStreet", 1234, 5);
//        
//        sf.addShop(shop1);
//        sf.addShop(shop2);
//        sf.addShop(shop3);
//        
//        Assertions.assertEquals(3, 3);
    }

    @Test
    @Disabled
    public void testGetShopsByPostalCode() {
        List<Shop> s = new ArrayList<>();
        s = sf.getShopsByPostalCode(4321);
        
        int actual = s.size();
        System.out.println("Actual " + actual);
        int expected = 2;
        
        Assertions.assertEquals(expected, actual);
    }
    
}
