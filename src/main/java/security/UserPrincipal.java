package security;

import entity.User;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserPrincipal implements Principal {

    private String email;
    private List<String> roles = new ArrayList<>();

    /* Create a UserPrincipal, given the Entity class User*/
    public UserPrincipal(User user) {
        this.email = user.getEmail();
        this.roles = user.getRolesAsStrings();
    }

    public UserPrincipal(String email, String roles) {
        super();
        this.email = email;
        this.roles = Arrays.asList(roles.split(","));
    }

    @Override
    public String getName() {
        return email;
    }

    public boolean isUserInRole(String role) {
        System.out.println("this.roles");
        System.out.println("rolesssssssss: " + role);
        System.out.println("this.roles");
        System.out.println("inroles:" + this.roles.contains(role));
        return this.roles.contains(role);
    }

    @Override
    public String toString() {
        return "UserPrincipal{" + "email=" + email + ", roles=" + roles + '}';
    }
}
