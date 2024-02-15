import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.HashMap;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
public class PatikaStore {
    TreeSet<Brand> brands;
    List<IProduct> products = new ArrayList<>();
    public Comparator<Brand> brandComparator = new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.compareTo(o2);
        }
    };

    public PatikaStore() {
        this.brands = new TreeSet<>(brandComparator);

    }

    public void addBrand(Brand brand) {
        brands.add(brand);

    }

    public void addProduct(String brandName, double price, double discount) {
        if (findBrand(brandName) != null) {
            Brand brand = findBrand(brandName);

            products.add(new CellPhone(brand, price, discount));

        }
    }

    public void addProduct(String brandName, double price, double discount, double screenSize) {

        if ((findBrand(brandName) != null)) {
            Brand brand = findBrand(brandName);
            products.add(new Notebook(brand, price, discount, screenSize));

        }
    }
    public void deleteProduct(int id) {
        IProduct product = findProduct(id);

        if(product != null) {
            products.remove(product);
        }
    }
    public Brand findBrand(String brand) {

        for (Brand b : brands) {
            if (b.getName().equals(brand)) {
                return b;
            }
        }
        return null;
    }
   public IProduct findProduct(int id) {
        for (IProduct product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    public List<IProduct> ListProducts() {
        return products;
    }

    public TreeSet<Brand> getBrands() {
        return brands;
    }

    @Override
    public String toString() {
        String result = "";
        for (IProduct product : products) {
            result+="--------------------------------\n";
            result += product.toString() + "\n";

        }
        result+="--------------------------------\n";
        return result;

    }

    public static void main(String[] args) {
        String[] brands = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        PatikaStore patikaStore = new PatikaStore();
        for (String brand : brands) {
            patikaStore.addBrand(new Brand(brand));
        }
        System.out.println("Store Management System");

        TreeSet<Brand> brandSet = patikaStore.getBrands();

        List<String> productList = Product.getItemTypes();

        while (!StdIn.isEmpty())
        {
            String event = StdIn.readString();
            if (event.equals("Add"))
            {
                String productType = StdIn.readString();

                if (productType.equals("Notebook"))
                {
                    String brand = StdIn.readString();
                    double price = StdIn.readDouble();
                    double discount = StdIn.readDouble();
                    double screenSize = StdIn.readDouble();
                    patikaStore.addProduct(brand, price, discount, screenSize);

                }
                else if (productType.equals("CellPhone"))
                {
                    String brand = StdIn.readString();

                    double price = StdIn.readDouble();
                    double discount = StdIn.readDouble();
                    patikaStore.addProduct(brand, price, discount);

                }
            }
            else if (event.equals("Delete"))
            {
                int id = StdIn.readInt();
                patikaStore.deleteProduct(id);
            }
            else if (event.equals("List PatikaStore"))
            {
                System.out.println(patikaStore.toString());
            }
            else if(event.equals("List Brands"))
            {
                for (Brand brand : brandSet) {
                    System.out.println(brand);
                }
            }
        }
        StdOut.println(patikaStore);
    }
}


