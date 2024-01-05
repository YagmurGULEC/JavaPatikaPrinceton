/*Area calculator from given right triangle edges- Dik ucgen alan hesaplama programi */

import java.util.Scanner;

public class AreaCalculator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("First length of the triangle: ");
        int a = input.nextInt();
        System.out.println("Second length of the triangle: ");
        int b=input.nextInt();
        //Hypotenus
        double c= Math.sqrt(a*a+b*b);
        System.out.println("Hypothenus: "+c);
        //Half of the perimeter
        double u=(a+b+c)/2;
        double area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Area: "+area);


    

        

        
    }
}