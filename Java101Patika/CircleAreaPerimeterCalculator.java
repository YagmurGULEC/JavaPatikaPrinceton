/*Area and Perimeter Calculator for a given radius belonging to a circle- Daire cevre ve alan hesaplama programi */
import java.util.Scanner;

public class CircleAreaPerimeterCalculator {

    public static void main(String[] args) {
        double pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.println("Give the radius of the circle: ");
        int r=input.nextInt();
        double area=pi*Math.pow(r, 2);
        double peri=2*pi*r;
        System.out.println("Perimeter: "+peri);
        System.out.println("Area: "+area);
    }
}