package entity;

import entity.CandyType;
import entity.Shop;
import entity.UserOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-28T09:46:49")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T12:45:47")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-27T12:31:16")
>>>>>>> malik
>>>>>>> 81581832a7e6d1c9c5c79b5a3ecad8dea7899265
@StaticMetamodel(Orderline.class)
public class Orderline_ { 

    public static volatile SingularAttribute<Orderline, Shop> shop;
    public static volatile SingularAttribute<Orderline, Integer> totalPricePrCandyType;
    public static volatile SingularAttribute<Orderline, Integer> totalWeight;
    public static volatile SingularAttribute<Orderline, Integer> id;
    public static volatile SingularAttribute<Orderline, UserOrder> uOrder;
    public static volatile SingularAttribute<Orderline, CandyType> type;

}