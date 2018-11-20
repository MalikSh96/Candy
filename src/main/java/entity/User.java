package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author malik
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "user_password")
    private String password;
    
    private String phone;
    private String city;
    private String address;
    private String zip;
    
    private int balance;
    
    @JoinTable(name = "user_roles", joinColumns = {
        @JoinColumn(name = "user_email", referencedColumnName = "user_email")}, inverseJoinColumns = {
        @JoinColumn(name = "role_name", referencedColumnName = "role_name")})
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Role> roleList = new ArrayList();
    
    
    //--------------------------------------------------------------------------
    //Necessary constructors

    //Creates and empty instance, makes it so no problems occur
    //An empty constructor is needed to create a new instance via reflection by your persistence framework
    public User() {
    }

    //Used when creating a user, these infos is important to fill out
    public User(String firstName, String lastName, String email, String password, String phone,
            String city, String address, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        String salt = BCrypt.gensalt();
        String hash = BCrypt.hashpw(password, salt);
        this.password = hash;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.zip = zip;
    }
    
    public User(String email, String userPass) {
        this.email = email;
        String salt = BCrypt.gensalt();
        String hash = BCrypt.hashpw(userPass, salt);
        this.password = hash;
    }
    
    //--------------------------------------------------------------------------
    //returns roles as strings
    public List<String> getRolesAsStrings() {
        if (roleList.isEmpty()) {
            return null;
        }
        List<String> rolesAsStrings = new ArrayList();
        for (Role role : roleList) {
            rolesAsStrings.add(role.getRoleName());
        }
        return rolesAsStrings;
    }
    
    
    //--------------------------------------------------------------------------
    //Password hashing and salting
    public boolean verifyPassword(String pw) {
        return BCrypt.checkpw(pw, password);
    }

    
    //--------------------------------------------------------------------------
    //Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public void addRole(Role userRole) {
        roleList.add(userRole);
    }
    
    //--------------------------------------------------------------------------
    //Java generated codes
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.User[ id=" + id + " ]";
    }
}
