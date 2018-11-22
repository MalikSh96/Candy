package facade;

import entity.User;
import exceptions.AuthenticationException;
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
public class UserFacade {
    
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    
    private static final UserFacade instance = new UserFacade();
    
    public UserFacade() {
    }
    
    public static UserFacade getInstance(){
        return instance;
    }
    
    public User getVerifiedUser(String username, String password) throws AuthenticationException {
        EntityManager manager = factory.createEntityManager();
        User user;
        try {
            user = manager.find(User.class, username);
            if (user == null || !user.verifyPassword(password)) {
                throw new AuthenticationException("Invalid email or password");
            }
        } finally {
            manager.close();
        }
        return user;
    }
    
    public User createUser(User user) 
    {
        //EntityManager manager = getEntityManager();
        EntityManager manager = factory.createEntityManager();
        System.out.println("Before try");
        try
        {
            System.out.println("In try");
            manager.getTransaction().begin();
            manager.persist(user);
            System.out.println("After persist " + user);
            manager.getTransaction().commit();
            return user;
        }
        finally
        {
            manager.close();
        }
    }
    
    
    public User findUser(String email) {
        //EntityManager manager = getEntityManager();
        EntityManager manager = factory.createEntityManager();
        User u = null;
        
        try
        {
            manager.getTransaction().begin();
            u = manager.find(User.class, email);
            manager.getTransaction().commit();
            return u;
        }
        finally
        {
            manager.close();
        }
    }
    
    public User editUser(User user) 
    {
        EntityManager manager = factory.createEntityManager();
        
        User u = null;
        
        try
        {
            manager.getTransaction().begin();
            u = manager.find(User.class, user.getEmail());
            System.out.println("You are here " + u);
            if(u != null)
            {
                manager.merge(user);
            }
            manager.getTransaction().commit();
            return u;
        }
        finally
        {
            manager.close();
        }
    }
    
    public List<User> getAllUsers() 
    {
        List<User> getUsers = new ArrayList<>();
        Query query = factory.createEntityManager().createQuery("SELECT NEW mappers.UserInfo(u.email, u.firstName, u.lastName) FROM User AS u");
        getUsers = query.getResultList();
        return getUsers;
    }
}

//    public User findUser(int id) {
//        //EntityManager manager = getEntityManager();
//        EntityManager manager = factory.createEntityManager();
//        User u = null;
//        
//        try
//        {
//            manager.getTransaction().begin();
//            u = manager.find(User.class, id);
//            manager.getTransaction().commit();
//            return u;
//        }
//        finally
//        {
//            manager.close();
//        }
//    }