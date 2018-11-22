package entity;

import calculator.Calculator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author malik
 */
@Entity
@Table(name = "userorder")
public class UserOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //order id

    @Temporal(TemporalType.DATE)
    private Date date;
    
    @ManyToOne
    private User user;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Orderline> orderLine = new ArrayList<>();
    
    private int totalPrice;

    //--------------------------------------------------------------------------
    public UserOrder() {
    }

    public UserOrder(Integer id, User user) {
        this.id = id;
        this.user = user;
    }

    public UserOrder(Date date, User user) {
        this.date = date;
        this.user = user;
    }

    public UserOrder(User user) {
        this.user = user;
    }

    
    //--------------------------------------------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Orderline> getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(List<Orderline> orderLine) {
        this.orderLine = orderLine;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
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
        if (!(object instanceof UserOrder)) {
            return false;
        }
        UserOrder other = (UserOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Order[ id=" + id + " ]";
    }
    
}
