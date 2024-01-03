/*Value-added tax calculator-KDV hesaplama programi */
import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Give the price: ");
    double amount=input.nextDouble();
    double tax=(amount<=1000)? amount*0.18 : amount*0.08;
    System.out.println("Price without tax: "+amount);
    System.out.println("Tax: "+tax);
    System.out.println("Price with tax: "+(amount+tax));
    
}
    
}