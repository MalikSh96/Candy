package entity;

import entity.CandyType;
import entity.Reviews;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T12:45:47")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-27T12:31:16")
>>>>>>> malik
@StaticMetamodel(Shop.class)
public class Shop_ { 

    public static volatile ListAttribute<Shop, Reviews> reviews;
    public static volatile SingularAttribute<Shop, Integer> phone;
    public static volatile SingularAttribute<Shop, Integer> price;
    public static volatile SingularAttribute<Shop, Integer> averageRating;
    public static volatile SingularAttribute<Shop, String> shopName;
    public static volatile ListAttribute<Shop, CandyType> sortiment;
    public static volatile SingularAttribute<Shop, Integer> id;
    public static volatile SingularAttribute<Shop, String> shopAddress;
    public static volatile SingularAttribute<Shop, Integer> shopPostalCode;
    public static volatile SingularAttribute<Shop, String> email;

}