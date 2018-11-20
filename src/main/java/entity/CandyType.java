package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author malik
 */
@Entity
@Table(name = "candytypes")
public class CandyType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String candyName; 
    //private String description; //is candy description needed?
    private int weight; //should be weight pr unit, remember!

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Orderline> line = new ArrayList<>();

    public CandyType() {
    }

    public CandyType(String candyName, int weight) {
        this.candyName = candyName;
        this.weight = weight;
    }
    
    
    //--------------------------------------------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCandyName() {
        return candyName;
    }

    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }

    public int getPrice() {
        return weight;
    }

    public void setPrice(int price) {
        this.weight = price;
    }

    public List<Orderline> getLine() {
        return line;
    }

    public void setLine(List<Orderline> line) {
        this.line = line;
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
        if (!(object instanceof CandyType)) {
            return false;
        }
        CandyType other = (CandyType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Candy[ id=" + id + " ]";
    }
    
}
