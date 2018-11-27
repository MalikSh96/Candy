package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author malik
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Shop.findAllByPostalCode", query = "SELECT s FROM Shop s where s.shopPostalCode = :shopPostalCode")})
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String shopName;
    private String shopAddress;
    private int shopPostalCode;
    private int price;
    
    private int phone;
    private String email;
    
    private int averageRating;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    List<Reviews> reviews = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.PERSIST)
    List<CandyType> sortiment = new ArrayList<>(); 
    
    //--------------------------------------------------------------------------
    //Neceassary constructors
    //Empty constructors avoids problems
    public Shop() {
    }

    public Shop(String shopName, String shopAddress, int shopPostalCode, int price, int phone, String email) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopPostalCode = shopPostalCode;
        this.price = price;
        this.phone = phone;
        this.email = email;
    }

    
    //--------------------------------------------------------------------------
    //Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public int getShopPostalCode() {
        return shopPostalCode;
    }

    public void setShopPostalCode(int shopPostalCode) {
        this.shopPostalCode = shopPostalCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int rating) {
        int r = 0;
        for (Reviews review : reviews) {
            r += review.getRating();
        }
        this.averageRating = (r/reviews.size());
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Reviews review)
    {
        reviews.add(review);
    }

    public List<CandyType> getSortiment() {
        return sortiment;
    }

    public void setSortiment(List<CandyType> candytype) {
        this.sortiment = candytype;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    //--------------------------------------------------------------------------
    //Java generated code
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shop)) {
            return false;
        }
        Shop other = (Shop) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Shop[ id=" + id + " ]";
    }
}
