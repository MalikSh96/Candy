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
//    private int weight; //should be weight pr unit, remember!
    
    private final int stock = 1;
    private String flavour;
    private String type;
    private String img;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Orderline> line = new ArrayList<>();

    public CandyType() {
    }

    public CandyType(String candyName) {
        this.candyName = candyName;

    }

    public CandyType(String candyName, String flavour, String type) {
        this.candyName = candyName;
        this.flavour = flavour;
        this.type = type;
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

    public List<Orderline> getLine() {
        return line;
    }

    public void setLine(List<Orderline> line) {
        this.line = line;
    }

    public int getStock() {
        return stock;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
        return "CandyType{" + "id=" + id + ", candyName=" + candyName + ", stock=" + stock + ", flavour=" + flavour + ", type=" + type + ", img=" + img + ", line=" + line + '}';
    }
}
