import java.util.Scanner;


public class CalculatorBasicSwitchCase
{
    public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
    System.out.println("First number :");
    int n1=inp.nextInt();
    System.out.println("Second number :");
    int n2=inp.nextInt();
    System.out.println("1-Sum\n 2-Substraction \n 3-Multiplication \n 4-Division :");
    int operation=inp.nextInt();
    switch (operation) {
        case 1:
            System.out.println("Sum:"+ (n1+n2));
            break;
        case 2:
            System.out.println("Subs:"+ (n1-n2));
            break;
        case 3:
            System.out.println("Multiplication:"+ (n1*n2));
            break;
        case 4:
            System.out.println("Div:"+ (n1/n2));
            break;
       
    }
           
        
        
    }
}