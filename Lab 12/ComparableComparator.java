import java.util.*;
import java.lang.*;

class Book implements Comparable<Book>
{
    //instance vars
    private String name;
    private double cost;
    public Book(String name, double cost)
    {
        this.name = name; this.cost = cost;
    }
    public String getName(){return this.name;}
    public double getCost(){return this.cost;}
    public int compareTo(Book b)
    {
        if(this.getCost() == b.getCost())
            return 0;
        else if(this.getCost() > b.getCost())
            return -1;
        else
            return 1;
    }
}

class PriceCompare implements Comparator<Book>
{
    public int compare(Book b1, Book b2)
    {
        if( b1.getCost() == b2.getCost())
            return 0;
        else if(b1.getCost() > b2.getCost())
            return -1;
        else
            return 1;
    }
}

class GeneralizedSearch
{
    public static void search(ArrayList<Book> bArr, String name)
    {
        for(Book b: bArr)
        {
            if(b.getName() == name)
            {
                System.out.println("Name:\t" + b.getName());
                System.out.println("Cost:\t" + b.getCost());
            }
        }
        
        

    }
}

class ComparableComparator 
{
    public static void main(String[] args)
    {
        ArrayList<Book> books = new ArrayList<>();
        Book b0 = new Book("Let Us C", 1200); books.add(b0);
        Book b1 = new Book("Harry Potter", 1000); books.add(b1);
        Book b2 = new Book("Percy Jackson", 1100); books.add(b2);
        Book b3 = new Book("Famous Five", 600); books.add(b3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book");
        String name = sc.next();
        GeneralizedSearch.search(books, name);
        
        System.out.println("Using Comparable Interface:\n");
        Collections.sort(books);
        for(Book b: books)
        {
            System.out.println("Name:\t " + b.getName() + " Cost:\t" + b.getCost());
        }
        
        PriceCompare pc = new PriceCompare();
        System.out.println("Using Comparator Interface:\n");
        Collections.sort(books, pc);
        for(Book b: books)
        {
            System.out.println("Name:\t " + b.getName() + " Cost:\t" + b.getCost());
        }
    }
}