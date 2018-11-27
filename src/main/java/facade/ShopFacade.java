package facade;

import entity.Shop;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import dto.ShopInfo;

/**
 *
 * @author malik
 */
public class ShopFacade {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    
    public Shop addShop(Shop shop) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("Before try");
        try {
            System.out.println("In try");
            manager.getTransaction().begin();
            manager.persist(shop);
            System.out.println("After persist " + shop);
            manager.getTransaction().commit();
            return shop;
        } finally {
            manager.close();
        }
    }
    
    public List<ShopInfo> getShopsByPostalCode(int postalCode) 
    {
        List<ShopInfo> shopsByPostalCode = new ArrayList<>();
        System.out.println("Zip" + postalCode);
        Query query = factory.createEntityManager().createQuery("SELECT NEW dto.ShopInfo(s) FROM Shop AS s where s.shopPostalCode = :shopPostalCode");
        query.setParameter("shopPostalCode", postalCode);
        shopsByPostalCode = query.getResultList();
        return shopsByPostalCode;
    }
    
    public List<ShopInfo> getAllShops() 
    {
        List<ShopInfo> allShops = new ArrayList<>();
        Query query = factory.createEntityManager().createQuery("SELECT NEW dto.ShopInfo(s) FROM Shop AS s");
        allShops = query.getResultList();
        return allShops;
    }
    
}
