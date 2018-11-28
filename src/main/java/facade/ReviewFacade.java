package facade;

import entity.Reviews;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author malik
 */
public class ReviewFacade {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    
    public Reviews addReview(Reviews review)
    {
        EntityManager manager = factory.createEntityManager();
        System.out.println("Before try");
        try {
            System.out.println("In try");
            manager.getTransaction().begin();
            manager.merge(review);
            manager.getTransaction().commit();
            System.out.println("After persist " + review);
            return review;
        } finally {
            manager.close();
        } 
    }
    
    public List<Reviews> getAllReviewsForOneShop(int shopId)
    {
        List<Reviews> allReviewsForOneShop = new ArrayList<>();
        System.out.println("shopId " + shopId);
        Query query = factory.createEntityManager().createQuery("SELECT r FROM Reviews r WHERE r.shop.id = :shopId");
        query.setParameter("shopId", shopId);
        allReviewsForOneShop = query.getResultList();
        return allReviewsForOneShop;
    }
}
