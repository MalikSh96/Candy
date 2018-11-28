package entity;

import entity.Role;
import entity.UserOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-27T12:31:16")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> zip;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, Integer> balance;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, String> city;
    public static volatile ListAttribute<User, UserOrder> userOrder;
    public static volatile ListAttribute<User, Role> roleList;
    public static volatile SingularAttribute<User, String> email;

}