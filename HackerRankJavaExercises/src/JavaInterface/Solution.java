package JavaInterface;


import java.util.*;



import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n){
        int total=0;
        if (n==1) return n;
        else if (n>1)
        {
            for (int i=2;i<n;i++)
            {
                if (n%i==0) total+=i;
            }
            total+=n;
            total+=1;
            return total;
        }
        else return 0;


    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}


