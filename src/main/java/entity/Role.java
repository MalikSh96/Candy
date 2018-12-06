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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author malik
 */
@Entity
@Table(name = "roles")
public class Role implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleID;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_name", length = 20)
    private String roleName;
    
    @ManyToMany(cascade = CascadeType.PERSIST ,mappedBy = "roleList")
    private List<User> userList = new ArrayList();

    
    //--------------------------------------------------------------------------
    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }
    
    
    //--------------------------------------------------------------------------
    public Integer getRoleID() {    
        return roleID;
    }
    
    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
