// Create a class Book with a nested class Author. Each book has a title, an array of authors (an author has a name and a surname) and a number of pages. Create a set of books and print them in alphabetical order.
import java.util.TreeSet;
import java.util.Comparator;
class NewComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getNumberOfPage() - b2.getNumberOfPage();
    }
}
public class Book implements Comparable<Book> {
    private final String title;
    private final int numberOfPage;
    private final int year;
    Book(String title,int numberOfPage,int year){

        this.title=title;
        this.numberOfPage=numberOfPage;
        this.year=year;

    }
    public String getTitle()
    {
        return title;
    }
    public int getNumberOfPage()
    {
        return numberOfPage;
    }
    public int getYear()
    {
        return year;
    }
    @Override
     public int compareTo(Book that)
    {
        return this.getTitle().compareTo(that.getTitle());
    }
    @Override
    public String toString()
    {
        return "Book{" + "title='" + title + '\'' + ", numberOfPage=" + numberOfPage + ", year=" + year + '}';
    }
    public static void main(String[] args){

        Book book1 = new Book("Java", 100,1990);
        Book book2 = new Book("Python", 200,1995);
        Book book3 = new Book("C++", 300,2000);
        Book book4 = new Book("C", 400,2005);
        Book book5 = new Book("C#", 500,2010);
        TreeSet<Book> set = new TreeSet<Book>();
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);
        set.add(book5);
        System.out.println("Books in alphabetical order");
        for (Book book : set) {
            System.out.println(book);
        }
        TreeSet<Book> set2 = new TreeSet<Book>(new NewComparator());
        set2.add(book1);
        set2.add(book2);
        set2.add(book3);
        set2.add(book4);
        set2.add(book5);
        System.out.println("Books in order of number of pages");
        for (Book book : set2) {
            System.out.println(book);
        }
    }




}
