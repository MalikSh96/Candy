package facade;

import static entity.Orderline_.type;
import entity.Shop;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
    
}
