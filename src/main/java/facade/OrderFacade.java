package facade;

import entity.UserOrder;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author malik
 */
public class OrderFacade {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    
    public UserOrder createOrder(UserOrder order) 
    {
        EntityManager manager = factory.createEntityManager();
        try
        {
            manager.getTransaction().begin();
            manager.persist(order);
            manager.getTransaction().commit();
            return order;
        }
        finally
        {
            manager.close();
        }
    }
    
}
