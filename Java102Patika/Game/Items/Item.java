package Items;

public abstract class Item {
    private int id = 0;
    private String name;
    private int price;

    public Item(String name,int id,int price){
        setName(name);
        setId(id);
        setPrice(price);

    }
    public abstract void printItemsInfo();
    //find by name
    public static Item FindItemByName(String name,Item[] items){
        for(Item item : items){
            if(item.getName().equals(name)){
                return item;
            }
        }return null;
    }
     //find by id
    public static Item FindItemByID(int id,Item[] items){
        for(Item item : items){
            if(item.getId()==id){
                return item;
            }
        }return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
}
