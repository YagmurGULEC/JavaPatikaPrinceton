import java.util.Scanner;

public class BodyMassIndexCalculator {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Give the height (m): ");
    double height=input.nextDouble();
    
    System.out.println("Give the weight (kg): ");
    int weight=input.nextInt();
    double index=weight/(Math.pow(height, 2));
    System.out.println("Body mass index: "+index);

}

}