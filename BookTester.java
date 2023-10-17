import java.util.*;
import java.lang.*;

class Book
{
    private long ISBN_no;
    private String name;
    private int Edition;
    private String Author;
    private String Publisher;
    private int Status;

    public String getName()
    {
        return this.name;
    }

    public Book(long ISBN_no, String name, int Edition, String Author, String Publisher, int Status)
    {
        this.ISBN_no = ISBN_no;
        this.name = name;
        this.Edition = Edition;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Status = Status;   
    }

    public void checkStatus()
    {
        switch(this.Status)
        {
            case 0: 
            System.out.println("Available");
            break;
            case 1:
            System.out.println("Issued");
            break;
            case 2:
            System.out.println("Reserved");
            break;
        }
    }

    public void changeStatus(int NewStatus)
    {
        System.out.print("Old Status:");
        this.checkStatus();
        this.Status = NewStatus;
        System.out.print("New Status:");
        this.checkStatus();
    }

    public void display()
    {
        System.out.println("ISBN Number:\t"+ this.ISBN_no);
        System.out.println("Name:\t"+ this.name);
        System.out.println("Edition:\t"+ this.Edition);
        System.out.println("Author:\t"+ this.Author);
        System.out.println("Publisher:\t"+ this.Publisher);
        System.out.print("Status:\t");
        this.checkStatus();
    }
}

class BookTester
{
    public static void main(String[] args)
    {
        LinkedList <Book> books = new LinkedList <Book>();
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book(122134, "Harry Potter and the Chamber of Secrets", 1, "JK Rowling", "Jaico Books", 2);
        Book b2 = new Book(2345678, "Let Us C", 19, "Yashwant Kanetkar", "Dhanpat Rai", 1);
        books.add(0, b1);
        books.add(1, b2);
        System.out.println("Please enter the number of books:\t");
        int n = sc.nextInt();
        Book[] arr = new Book[n];
        for(int i = 0; i<n; i++)
        {
            System.out.println("For Book " + (i+1));

            System.out.println("ISBN:\t");
            long ISBN = sc.nextLong();

            System.out.println("Name:\t");
            String name = sc.next();

            System.out.println("Edition:\t");
            int Edition = sc.nextInt();

            System.out.println("Author:\t");
            String Author = sc.next();

            System.out.println("Publisher:\t");
            String Publisher = sc.next();

            System.out.println("Status:\t");
            int Status = sc.nextInt();
            
            arr[i] = new Book(ISBN, name, Edition, Author, Publisher, Status);

        }

        books.addFirst(arr[0]);
        books.addLast(arr[1]);
        sc.nextLine();
        System.out.println("Enter the name of the book whose status is to be changed:\t");
        String UserInput = sc.nextLine();
        System.out.println("Enter the new status 0,1,2:\t");
        int NewStatus = sc.nextInt();
        for(Book b: books)
        {
            if(b.getName().equals(UserInput))
            {
                b.changeStatus(NewStatus);
            }
        }

        System.out.println("The details of the books are:\t");
        for(Book b: books)
        {
            System.out.println();
            b.display();
            System.out.println();
        }
        
    }
}
