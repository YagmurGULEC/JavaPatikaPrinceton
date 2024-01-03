/*Calculate average of the grades given - Ortalama hesaplamak icin pratik */
import java.util.Scanner;
public class AverageCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Math: ");
        int math=input.nextInt();
        System.out.println("Physics: ");
        int physics=input.nextInt();
        System.out.println("Chemistry: ");
        int chemistry=input.nextInt();
        System.out.println("Turkish: ");
        int turkish=input.nextInt();
        System.out.println("History: ");
        int history=input.nextInt();
        System.out.println("Music: ");
        int music=input.nextInt();
        int sum=math+physics+chemistry+turkish+history+music;
        double average=sum/6;
        String result=(average>60) ? "Passed" : "Failed";
        System.out.println("Average is: "+ average);
        System.out.println(result);

    }
}
