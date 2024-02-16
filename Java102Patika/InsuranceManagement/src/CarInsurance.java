import java.util.Date;
public class CarInsurance extends Insurance{
    CarInsurance(String name, Date startDate, Date endDate) {
        super(name, startDate, endDate);
    }
    @Override
    public double getFee() {
        return 200.0;
    }
    @Override
    public void printQuote() {
        System.out.println("Car insurance quote");
    }
}
