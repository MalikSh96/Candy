package facade;

import entity.Orderline;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OrderlineFacade {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");

    public Orderline createOrderline(Orderline line) {
        EntityManager manager = factory.createEntityManager();
        try {
            manager.getTransaction().begin();
            manager.merge(line);
            manager.getTransaction().commit();
            return line;
        } finally {
            manager.close();
        }
    }

    public List<Orderline> getAllOrderlines() {
        List<Orderline> olList = new ArrayList();

        EntityManager manager = factory.createEntityManager();
        try {
            Query query = manager.createQuery("SELECT new mappers.Orderline FROM candydummy.orderline");
            olList = query.getResultList();
        } finally {
            manager.close();
        }
        return olList;
    }

}
