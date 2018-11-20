/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Orderline;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author malik
 */
public class OrderlineFacade {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    
    public Orderline createOrderline(Orderline line) 
    {
        EntityManager manager = factory.createEntityManager();
        try
        {
            manager.getTransaction().begin();
            manager.merge(line);
            manager.getTransaction().commit();
            return line;
        }
        finally
        {
            manager.close();
        }
    }   
}
