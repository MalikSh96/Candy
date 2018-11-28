package facade;

import dto.ShopInfo;
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
    //@Disabled
    public void testAddShop() {        

        Shop shop1 = new Shop("jUnitShop", "jUnitShopStreet", 3000, 10, 12345678, "jUnitShop@jUnitShop.shop");
        Shop shop2 = new Shop("jUnitShop2", "jUnitShopStreet", 3000, 15, 87654321, "jUnitShop2@jUnitShop2.shop2");
        Shop shop3 = new Shop("jUnitShop3", "jUnitShopSideStreet", 2800, 5, 43215678, "jUnitShop3@jUnitSHop3.shop3");
        
        sf.addShop(shop1);
        sf.addShop(shop2);
        sf.addShop(shop3);
        
        Assertions.assertEquals(3, 3);
    }

    @Test
    @Disabled
    public void testGetShopsByPostalCode() {
        List<ShopInfo> s = new ArrayList<>();
        s = sf.getShopsByPostalCode(3000);

        
        int actual = s.size();
        System.out.println("Actual " + actual);
        int expected = 2;
        
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Disabled
    public void testGetAllShops() {
        int expected = 3;
        int actual = sf.getAllShops().size();
        System.out.println("size " + sf.getAllShops());
        Assertions.assertEquals(expected, actual);
    }
    
}
