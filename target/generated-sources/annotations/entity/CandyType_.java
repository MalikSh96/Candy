package entity;

import entity.Orderline;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-29T12:43:33")
@StaticMetamodel(CandyType.class)
public class CandyType_ { 

    public static volatile SingularAttribute<CandyType, String> img;
    public static volatile SingularAttribute<CandyType, String> flavour;
    public static volatile ListAttribute<CandyType, Orderline> line;
    public static volatile SingularAttribute<CandyType, String> candyName;
    public static volatile SingularAttribute<CandyType, Integer> id;
    public static volatile SingularAttribute<CandyType, Integer> stock;
    public static volatile SingularAttribute<CandyType, String> type;

}