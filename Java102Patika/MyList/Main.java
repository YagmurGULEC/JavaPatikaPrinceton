package Java102Patika.MyList;

public class Main {
public static void main(String[] args) {
    MyList<Integer> l=new MyList<>();
    for (int i=0;i<10;i++)
    l.add(i);
    System.out.println(l);
    Object[] arr=l.toArray();
    System.out.println(arr[0]);
  }
    
}
