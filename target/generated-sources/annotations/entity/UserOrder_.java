package entity;

import entity.Orderline;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-22T13:01:34")
@StaticMetamodel(UserOrder.class)
public class UserOrder_ { 

    public static volatile SingularAttribute<UserOrder, Date> date;
    public static volatile SingularAttribute<UserOrder, Integer> totalPrice;
    public static volatile ListAttribute<UserOrder, Orderline> orderLine;
    public static volatile SingularAttribute<UserOrder, Integer> id;
    public static volatile SingularAttribute<UserOrder, User> user;

}