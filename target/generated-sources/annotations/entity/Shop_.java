package entity;

import entity.CandyType;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T09:55:29")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:22:28")
>>>>>>> 803baf377b864de80d01769de41e1f8383eb2d55
@StaticMetamodel(Shop.class)
public class Shop_ { 

    public static volatile ListAttribute<Shop, List> reviews;
    public static volatile SingularAttribute<Shop, Integer> price;
    public static volatile SingularAttribute<Shop, Integer> averageRating;
    public static volatile SingularAttribute<Shop, String> shopName;
    public static volatile ListAttribute<Shop, CandyType> sortiment;
    public static volatile SingularAttribute<Shop, Integer> id;
    public static volatile SingularAttribute<Shop, String> shopAddress;
    public static volatile SingularAttribute<Shop, Integer> shopPostalCode;

}