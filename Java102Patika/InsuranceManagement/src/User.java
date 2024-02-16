import java.util.List;
import java.util.ArrayList;
import java.util.Date;
public class User {
    private String name;
    private String email;
    private String password;
    private String jobTitle;
    private int age;
    private Date lastLoginDate;
    protected List <IAddress> addresses;
    User(String name, String email, String password, String jobTitle, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.jobTitle = jobTitle;
        this.age = age;
        this.addresses = new ArrayList<IAddress>();
        this.lastLoginDate = new Date();
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        String res= "User [name=" + name + ", email=" + email + ", password=" + password + ", jobTitle=" + jobTitle + ", age=" + age ;
        for (IAddress address : addresses) {
            res += ", address=" + address;
        }
        return res + "]";
    }


}
