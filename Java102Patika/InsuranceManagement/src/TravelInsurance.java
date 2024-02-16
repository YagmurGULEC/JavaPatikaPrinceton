import java.util.Date;
public class TravelInsurance extends Insurance<TravelInsurance> {
    TravelInsurance(String name, Date startDate, Date endDate) {
        super(name, startDate, endDate);
    }
    @Override
    public double getFee() {
        return 100.0;
    }
    @Override
    public void printQuote() {
        System.out.println("Travel insurance quote");
    }

}
