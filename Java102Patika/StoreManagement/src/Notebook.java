public class Notebook extends Product<Notebook>{
    private double screenSize;
    public Notebook(Brand brand, double price, double discount,double screenSize){
        super(brand, price, discount);
        this.screenSize=screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {

        return "Notebook{"+
                "id=" + getId()+
                ", brand=" + getBrand() +
                ", price=" + getPrice() +
                ", discount=" + getDiscount() +
                ", screen size=" + getScreenSize() +
                '}';
    }
}
