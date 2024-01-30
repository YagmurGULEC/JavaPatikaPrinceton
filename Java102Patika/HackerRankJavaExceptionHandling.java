import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankJavaExceptionHandling {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int a,b;
    try{
        a=input.nextInt();
        b=input.nextInt();
        System.out.println(a/b);
    }
    catch(InputMismatchException e){
        System.out.println(e.getClass().toString().substring(6));
   }
   catch(Exception e)
   {
    System.out.println(e);
   }

    
}
}
