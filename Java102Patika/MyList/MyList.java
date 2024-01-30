package Java102Patika.MyList;

import java.util.Stack;

public class MyList<T> implements IMyList<T> {
    private int capacity=10;
    private T[] arr;
    public int lastIndex=0;

    MyList(){
        //casting
        arr=(T[]) new Object[capacity];
    }
    MyList(int size)
    {
        arr=(T[]) new Object[size];
    }
    @Override
    public void add(T data) {
        
        if(lastIndex<arr.length) arr[lastIndex++]=data;
        else{
            capacity*=2;
            //copy first half to the new array
            T[] tempArray=(T[]) new Object[capacity];
            int i=0;
            for(i=0;i<arr.length;i++)
            {
                tempArray[i]=arr[i];
                
            }
            //insert the data after enlarging the array
            tempArray[lastIndex++]=data;
            
            arr=tempArray;

        }
        
    }

    @Override
    public void clear() {

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=null;
        }
           
        lastIndex=0;
        
    }

    @Override
    public boolean contains(T data) {
        for(T item:arr)
        {
            if(item==data)
            return true;
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (index<0 | index>=arr.length) return null;
        else return arr[index];
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public int indexOf(T data) {
        for (int i=0;i<arr.length;i++)
            {
                if (arr[i]==data)
                    return i;
            }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return (lastIndex==0);
    }

    @Override
    public int lastIndexOf(T data) {
        for (int i=arr.length-1;i>0;i--)
            {
                if (arr[i]==data)
                    return i;
            }
        return -1;
    }

    @Override
    public T remove(int index) {
        if (index<0 | index>arr.length-1)
        return null;
        T temp=arr[index];
        arr[index]=null;
        lastIndex--;
        return temp;
    }

    @Override
    public T set(int index,T data) {
        if (index<0 | index>= arr.length) return null;
        else
        {
            arr[index]=data;
            return arr[index];
        }
        
    }
    @Override
    public String toString()
    {
        String x="[";
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]!=null)
                x+=" "+arr[i];

        }
        x+="]";
        return x;
    }
    @Override
    public int getCapacity() {
        
        return lastIndex;
    }

    @Override
    public MyList<T> subList(int start, int finish) {
        //if indices are not valid
        if (start>finish | start<0 | finish>arr.length-1)
        return null;
        else{
            MyList<T> newList=new MyList<T>(finish-start+1);
            //copy from this array
            for (int i=start;i<=finish;i++)
            newList.add(this.arr[i]);
            return newList;
             
        }
    }

    @Override
    public T[] toArray() {
        
        return arr;
    }
    //Tests
    public static void main(String[] args) {
        MyList<Integer> l=new MyList<>();
        System.out.println("----------");
        System.out.println("Number of elements in the list : " + l.size());
        System.out.println("The capacity of the list : " + l.getCapacity());
        for (int i=1;i<5;i++)
            l.add(i*10);
        //Testing for size and capacity
        System.out.println("Number of elements in the list "+l.size());
        System.out.println("The capacity of the list : " + l.getCapacity());
        for (int i=5;i<12;i++)
            l.add(i*10);
        //Testing for size and capacity after overexceeding the capacity
        System.out.println("Number of elements in the list "+l.size());
        System.out.println("The capacity of the list : " + l.getCapacity());
        System.out.println("----------");

        MyList<Integer> l2=new MyList<>();
        for (int i=1;i<4;i++)
            l2.add(i*10);
        System.out.println("The capacity of the list : " + l2.getCapacity());
        System.out.println("Second element : " + l2.get(2));
        System.out.println("The element removed: "+ l2.remove(2));
        System.out.println("The capacity of the list : " + l2.getCapacity());
        l2.add(40);
        l2.set(0, 100);
        System.out.println("Second element: " + l2.get(2));
        System.out.println(l2.toString());
        System.out.println("----------");
        MyList<Integer> l3 = new MyList<>();
        System.out.println("List is : " + (l3.isEmpty() ? "Empty" : "Full"));
        l3.add(10);
        l3.add(20);
        l3.add(30);
        l3.add(40);
        l3.add(20);
        l3.add(50);
        l3.add(60);
        l3.add(70);
        System.out.println("List is : " + (l3.isEmpty() ? "Empty" : "Full"));
         // The first index found
        System.out.println("Indeks : " + l3.indexOf(20));
        System.out.println("Indeks :" + l3.indexOf(100));
        System.out.println("Indeks : " + l3.lastIndexOf(20));
        // Listeyi Object[] dizisi olarak geri verir.
        Object[] listOf = l3.toArray();
        System.out.println("The first element to test toArray():" + listOf[0]);
        MyList<Integer> altListem = l3.subList(0, 3);
        System.out.println(altListem.toString());
        System.out.println("Does it contain 20?" + l3.contains(20));
        System.out.println("Does it contain 120?" + l3.contains(120));
        l3.clear();
        System.out.println(l3.toString());
}       
}