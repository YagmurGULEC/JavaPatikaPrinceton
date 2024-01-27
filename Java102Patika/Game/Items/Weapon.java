package Items;

public class Weapon extends Item {
    private int damage;
    public Weapon(String name, int id, int damage, int price) {
        super(name, id, price);
        setDamage(damage);
    }
    public static Weapon[] createWeapons(){
        Weapon[] weapons=new Weapon[2];
        weapons[0]=new Weapon("Weapon1", 1, 5, 10);
        weapons[1]=new Weapon("Weapon2", 2, 5, 10);
        return weapons;
    }
    @Override
    public void printItemsInfo() {
       for (Weapon weapon: createWeapons())
       {
        System.out.println("id": +weapon.getId()+"name "+weapon.getName() +"damage "+weapon.getDamage());
       }
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
}
