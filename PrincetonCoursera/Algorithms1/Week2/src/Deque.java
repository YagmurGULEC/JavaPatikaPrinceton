import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int size;

    private static class Node<Item> {
        Item item;
        Node<Item> next;
        Node<Item> previous;

    }

    private class DequeIterator implements Iterator<Item> {
        private Node<Item> current = first;


        public boolean hasNext() {
            return current != null;
        }


        public void remove() {
            throw new UnsupportedOperationException("Remove is not supported");
        }


        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more items to return");
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    // construct an empty deque
    public Deque() {
        first = null;
        last = null;
        size = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return (size == 0);
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }

        Node<Item> oldfirst = first;

        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        if (isEmpty())
            last = first;
        else
            oldfirst.previous = first;
        size++;

    }

    // add the item to the last
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        Node<Item> oldlast = last;
        last = new Node<Item>();
        last.item = item;

        if (isEmpty()) {
            first = last;
        } else {
            last.previous = oldlast;
            oldlast.next = last;
        }
        size++;

    }

    // remove and return the item from the first
    public Item removeFirst() {

        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        Node<Item> node = first;
        if (size == 1) {

            first = null;
            last = null;

        } else {

            first = first.next;
            first.previous = null;

        }
        size--;
        return node.item;

    }

    // remove and return the item from the last
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }

        Node<Item> node = last;
        if (size == 1) {

            first = null;
            last = null;

        } else {

            last = last.previous;
            last.next = null;

        }
        size--;
        return node.item;
    }

    // return an iterator over items in order from first to last
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    // unit testing (required)
    public static void main(String[] args) {
        Deque<String> s = new Deque<>();
        s.addFirst("Third");
        s.addFirst("Second");
        s.addFirst("First");
        s.addLast("Fourth");
        s.addLast("Fifth");
        s.removeLast();
        s.removeLast();
        s.removeFirst();
        s.removeFirst();
        StdOut.println(s.isEmpty());
        // s.removeFirst();
        // while (!StdIn.isEmpty()) {
        // String item = StdIn.readString();
        // if (!item.equals("-")) {
        // s.addFirst(item);
        // } else {
        // s.removeFirst();
        // }

        // }
        for (String item : s) {
            StdOut.print(item + " ");
        }

    }

}