import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.lang.IllegalArgumentException;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private static final int INIT_CAPACITY=1;
    private Item[] data;
    private int size;
    // construct an empty randomized queue
    public RandomizedQueue(){
        data=(Item[]) new Object[INIT_CAPACITY];
        size=0;

    }
    // is the randomized queue empty?
    public boolean isEmpty(){
        return size==0;
    }
    // return the number of items on the randomized queue
    public int size()
    {
        return size;
    }
    public void enqueue(Item item)
    {
        if (item==null) throw new IllegalArgumentException();
        if (size==data.length) resize(2* data.length);//double size of array
        data[size++]=item;
    }

    public Item dequeue()
    {
        if (isEmpty()) throw new NoSuchElementException();
        Item item=data[size-1];
        data[size-1]=null;// avoid loitering
        size--;
        // shrink size of array if necessary
        if (size> 0 && size == data.length/4) resize(data.length/2);
        return item;
    }
    private void resize(int capacity)
    {
        assert capacity >= size;

        // textbook implementation
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = data[i];
        }
        data = copy;

        // alternative implementation
        // a = java.util.Arrays.copyOf(a, capacity);
    }
    public Item sample()
    {
        if (isEmpty()) throw new java.util.NoSuchElementException();
        int index = StdRandom.uniform(size);
        return (Item) data[index];
    }
    // return an independent iterator over items in random order
    public Iterator<Item> iterator(){
        return new RandomizedQueueIterator();
    }

    private class RandomizedQueueIterator<Item> implements Iterator<Item>
    {
        public int i=0;
        public int[] randomOrder;
        public RandomizedQueueIterator(){

            randomOrder= new int[size];
            for (int i=0;i<size;i++)
            {
                randomOrder[i]=i;
            }
            StdRandom.shuffle(randomOrder);
        }
        public boolean hasNext() {
            return i<size;
        }
        public void remove() {
            throw new UnsupportedOperationException("Remove is not supported");
        }
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more items to return");
            }
            return (Item) data[randomOrder[i++]];
        }
    }
    public static void main(String[] args)
    {
        RandomizedQueue<Integer> queue = new RandomizedQueue<>();
        queue.enqueue(914);
        queue.enqueue(15);
        queue.enqueue(524);
        queue.enqueue(938);
        queue.enqueue(811);
        queue.enqueue(221);
        queue.enqueue(717);
        queue.enqueue(923);
        queue.enqueue(75);

        StdOut.println(queue.isEmpty());
        StdOut.println(queue.size());
        StdOut.println(queue.sample());
        for (Integer i:queue)
            StdOut.println(i);
 }
}


