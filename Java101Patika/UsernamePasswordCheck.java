
import java.util.Scanner;
public class UsernamePasswordCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Your username: ");
        String username=input.nextLine();
        System.out.print("Your password: ");
        String password=input.nextLine();
        if (username.equals("patika") && password.equals("java123")) System.out.println("Logged in");
        else System.out.println("Either wrong username or password");
    }
    
}
