import java.util.ArrayList;
import java.util.List;

public abstract class Product<Item> implements IProduct{
    private final int id;
    private static int startId=1;
    private final Brand brand;
    private final double price;
    private final double discount;

    protected static List<String> subclasses = new ArrayList<>();
    protected static String tabulate="Product | Brand | Price | Discount |Screen Size";

    static{
        subclasses.add("CellPhone");
        subclasses.add("Notebook");
    }

    public Product(Brand brand, double price, double discount) {
        this.id = startId;
        startId++;
        this.brand = brand;
        this.price = price;
        this.discount = discount;


    }

    public static List<String> getItemTypes() {

        return subclasses;
    }
    public int getId() {
        return id;
    }


    public Brand getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }



}
