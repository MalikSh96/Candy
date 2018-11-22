package mappers;

/**
 *
 * @author malik
 */
public class UserInfo {
    private String email;
    private String fullname;

    public UserInfo(String email, String firstName, String lastName) {
        this.email = email;
        this.fullname = firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "UserInfo{" + "email=" + email + ", fullname=" + fullname + '}';
    }
}
