import java.util.Scanner;

public class CashierCalculator {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double total=0;
        double[] prices={2.14,3.67,1.11,0.95,5};
        System.out.println("How many kilogram of pear: ");
        total+=prices[0]*inp.nextInt();
        System.out.println("How many kilogram of apple: ");
        total+=prices[1]*inp.nextInt();
        System.out.println("How many kilogram of tomatoes: ");
        total+=prices[2]*inp.nextInt();
        System.out.println("How many kilogram of banana: ");
        total+=prices[3]*inp.nextInt();
        System.out.println("How many kilogram of eggplant: ");
        total+=prices[4]*inp.nextInt();
        System.out.println("Total price: "+total);
    }
    
}
