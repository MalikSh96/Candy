package dto;

import entity.User;

/**
 *
 * @author malik
 */
public class UserInfo {
    private String email;
    private String fullname;

    public UserInfo(User user)
    {
        this.email = user.getEmail();
        this.fullname = user.getFirstName() + " " + user.getLastName();
    }
    
//    public UserInfo(String email, String firstName, String lastName) {
//        this.email = email;
//        this.fullname = firstName + " " + lastName;
//    }

    @Override
    public String toString() {
        return "UserInfo{" + "email=" + email + ", fullname=" + fullname + '}';
    }
}
