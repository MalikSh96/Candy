package entity;

import calculator.Calculator;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author malik
 */
@Entity
public class Orderline implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int totalPricePrCandyType;
    
    @ManyToOne
    private UserOrder userOrder; /*<-- is the customers id from that originates from the customerorder table, customer_id is the 
    id that identifies the "original id" (also customerorder tabel) */

    @ManyToOne
    private CandyType type = new CandyType();
    
    private int totalWeight;
    private Shop shop;


    //--------------------------------------------------------------------------
    public Orderline() {
    }
    //implement necessary constructors

    public Orderline(int totalPricePrCandyType, UserOrder userOrder, int totalWeight) {
        this.totalPricePrCandyType = totalPricePrCandyType;
        this.userOrder = userOrder;
        this.totalWeight = totalWeight;
    }

    public Orderline(int totalWeight, CandyType type)
    {
        this.type = type;
        this.totalWeight = totalWeight;
    }
    
    
    
    //--------------------------------------------------------------------------    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserOrder getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(UserOrder UserOrder) {
        this.userOrder = UserOrder;
    }

    public CandyType getType() {
        return type;
    }

    public void setType(CandyType type) {
        this.type = type;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int weight) {
        this.totalWeight = weight;
    }

    public int getTotalPricePrCandyType() {
        return totalPricePrCandyType;
    }

    public void setTotalPricePrCandyType(int totalPricePrCandyType) {
        this.totalPricePrCandyType = totalPricePrCandyType;
    }

    
    //--------------------------------------------------------------------------
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderline)) {
            return false;
        }
        Orderline other = (Orderline) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Orderline[ id=" + id + " ]";
    }
    
}
