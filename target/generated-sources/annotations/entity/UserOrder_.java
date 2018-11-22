package entity;

import calculator.Calculator;
import entity.Orderline;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T14:26:11")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T09:55:29")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:22:28")
>>>>>>> 803baf377b864de80d01769de41e1f8383eb2d55
>>>>>>> 0dc72fb017f04cf8eb6efe3a89883643c00d1a2a
@StaticMetamodel(UserOrder.class)
public class UserOrder_ { 

    public static volatile SingularAttribute<UserOrder, Date> date;
    public static volatile SingularAttribute<UserOrder, Integer> totalPrice;
    public static volatile ListAttribute<UserOrder, Orderline> orderLine;
    public static volatile SingularAttribute<UserOrder, Integer> id;
    public static volatile SingularAttribute<UserOrder, Calculator> calc;
    public static volatile SingularAttribute<UserOrder, User> user;

}