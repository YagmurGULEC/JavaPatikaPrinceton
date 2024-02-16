import java.util.Date;
public class AccountManager {
    public static void main(String[] args) {
        User user = new User("John", "g@gmail.com", "1234", "Engineer", 35);
        System.out.println(user);
        Enterprise enterprise = new Enterprise(user);
        enterprise.Login("g@gmail.com", "1234");
        System.out.println(enterprise);
        Insurance<TravelInsurance> travelInsurance = new TravelInsurance("Car Insurance", new Date(), new Date());
        enterprise.addInsurance(travelInsurance);
    }
}
