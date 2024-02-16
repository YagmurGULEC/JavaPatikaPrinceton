import java.util.Date;
public abstract class Insurance<Item> {
    private String name;
    private double fee;
    private Date startDate;
    private Date endDate;
    public abstract double getFee();
    Insurance(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract void printQuote();
}
