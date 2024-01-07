import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args) {
        System.out.println("Please enter an integer");
        Scanner inp=new Scanner(System.in);
        int origNum=inp.nextInt();
        int num=origNum;
        int reversed=0;
        while (num!=0)
        {
            int remainder=num%10;
            reversed=reversed*10+remainder;
            num/=10;
        }
        System.out.println("Reversed "+reversed);
        if (origNum==reversed) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
    
}
