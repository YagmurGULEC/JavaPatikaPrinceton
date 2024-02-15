public class CellPhone extends Product<CellPhone>{

    public CellPhone(Brand brand, double price, double discount) {
        super(brand, price, discount);


    }
    @Override
    public String toString() {

        return "CellPhone{"+
                "id=" + getId()+
                ", brand=" + getBrand() +
                ", price=" + getPrice() +
                ", discount=" + getDiscount() +
                '}';
    }

}
