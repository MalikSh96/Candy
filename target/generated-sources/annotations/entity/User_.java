package entity;

import entity.Role;
import entity.UserOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-28T09:46:49")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T12:45:47")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-27T12:31:16")
>>>>>>> malik
>>>>>>> 81581832a7e6d1c9c5c79b5a3ecad8dea7899265
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T14:37:35")
>>>>>>> 9af97bfa119e9c56a3d50cb3184290b8026580f3
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