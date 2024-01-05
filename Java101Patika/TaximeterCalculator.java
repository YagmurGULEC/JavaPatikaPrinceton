/* Calculate how it costs a taxi ride based on the given kilometer */
import java.util.Scanner;
public class TaximeterCalculator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kilometer: ");
        int km=input.nextInt();
        double perKm=2.20;
        double total=10,minPrice=20;
        total+=km*perKm;
        total=(total<20)?20:total;
        System.out.println("Total price: "+ total);

        
    }
}