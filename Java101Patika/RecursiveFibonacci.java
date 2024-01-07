import java.util.Scanner;

public class RecursiveFibonacci {
    
    public static int calculateFib(int n)
    {
        if (n==0 || n==1)
        return 1;
        else
        return calculateFib(n-1)+calculateFib(n-2);
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Give n to calculate fib(n)");
        int number=inp.nextInt();
        int result=calculateFib(number);
        System.out.println("Fibonacci of "+number+" is "+result);

    }
}
