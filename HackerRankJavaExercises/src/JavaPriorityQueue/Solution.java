package JavaPriorityQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCGPA() {
        return cgpa;
    }
}
class Priorities{
    private static final Comparator<Student> STUDENT_NEW_COMPARATOR=new Comparator<Student>(){

        public int compare(Student a, Student b){
            int result=Double.compare(b.getCGPA(),a.getCGPA());
            result= (result==0) ? a.getName().compareTo(b.getName()) :result;
            result= (result==0) ? Integer.compare(a.getID(),b.getID()) :result;
            return result;
        }
    };
    List<Student> getStudents(List<String> events){
        PriorityQueue<Student> newQueue=new PriorityQueue<>(events.size(),STUDENT_NEW_COMPARATOR);
        for (String s: events)
            if (s.equals("SERVED"))
                newQueue.poll();
            else
            {
                String[] lst=s.split(" ");
                String name=lst[1];
                double gpa=Double.parseDouble(lst[2]);
                int id=Integer.parseInt(lst[3]);
                Student newS=new Student(id,name,gpa);
                newQueue.add(newS);
            }
        List<Student> students=new ArrayList<>();
        while (!newQueue.isEmpty())
        {
            students.add(newQueue.poll());
        }
        return students;
    }
}
public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}