/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.CandyType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author malik
 */
public class CandyFacade {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");

    public CandyType addCandy(CandyType type) {
        EntityManager manager = factory.createEntityManager();
        System.out.println("Before try");
        try {
            System.out.println("In try");
            manager.getTransaction().begin();
            manager.persist(type);
            System.out.println("After persist " + type);
            manager.getTransaction().commit();
            return type;
        } finally {
            manager.close();
        }
    }

    public CandyType findCandyById(int id) {
        //EntityManager manager = getEntityManager();
        EntityManager manager = factory.createEntityManager();
        CandyType ct = null;

        try {
            manager.getTransaction().begin();
            ct = manager.find(CandyType.class, id);
            manager.getTransaction().commit();
            return ct;
        } finally {
            manager.close();
        }
    }

}
