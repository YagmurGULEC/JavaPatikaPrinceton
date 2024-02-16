import java.util.ArrayList;
import java.util.List;
enum AuthenticationStatus {
    SUCCESS,
    FAILURE
}
class InvalidAuthenticationException extends Exception {
    private static final String message="Wrong username or password";
    public InvalidAuthenticationException() {
        super(message);
    }
}


public abstract class Account<Item> implements IAccount{
    private AuthenticationStatus status;
    private User user;
    protected static List<Insurance> insurances;
    public Account(User user) {
        this.user = user;
        this.insurances = new ArrayList<Insurance>();
    }
    public abstract void addInsurance(Insurance insurance);
    public void Login(String username, String password) {
        if (user.getEmail().equals(username) && user.getPassword().equals(password)) {
            status = AuthenticationStatus.SUCCESS;
        } else {
            status = AuthenticationStatus.FAILURE;
        }
    }
    public void showUserInfo() {
        System.out.println(user);
    }
    @Override
    public String toString() {
        return "Account [status=" + status + ", user=" + user + "]";
    }
}
