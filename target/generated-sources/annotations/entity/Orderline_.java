package entity;

import entity.CandyType;
import entity.Shop;
import entity.UserOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-22T12:48:07")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-22T11:03:02")
>>>>>>> malik
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-27T12:31:16")
>>>>>>> malik
@StaticMetamodel(Orderline.class)
public class Orderline_ { 

    public static volatile SingularAttribute<Orderline, Shop> shop;
    public static volatile SingularAttribute<Orderline, Integer> totalPricePrCandyType;
    public static volatile SingularAttribute<Orderline, Integer> totalWeight;
    public static volatile SingularAttribute<Orderline, Integer> id;
    public static volatile SingularAttribute<Orderline, UserOrder> uOrder;
    public static volatile SingularAttribute<Orderline, CandyType> type;

}