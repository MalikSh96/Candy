package entity;

import entity.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T09:55:29")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:22:28")
>>>>>>> 803baf377b864de80d01769de41e1f8383eb2d55
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile ListAttribute<Role, User> userList;
    public static volatile SingularAttribute<Role, Integer> roleID;
    public static volatile SingularAttribute<Role, String> roleName;

}