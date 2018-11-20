/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

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

    @ManyToOne
    private UserOrder userOrder; /*<-- is the customers id from that originates from the customerorder table, customer_id is the 
    id that identifies the "original id" (also customerorder tabel) */

    
    //--------------------------------------------------------------------------
    public Orderline() {
    }
    //implement necessary constructors
    
    
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
