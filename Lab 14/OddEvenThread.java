import java.util.*;
import java.lang.*;

class MyThread extends Thread
{
    public static int i = 0;
    public int start,end;

    public MyThread(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run()
    {
        try
        {
            if(i == 0)
            {
                System.out.println("EVEN NUMBERS:");
                for(int x = this.start; x<=this.end; x++)
                {
                    if(x%2==0)
                        System.out.print(x + " ");
                }
                System.out.println();
                i++;
            }

            if(i == 1)
            {
                System.out.println("ODD NUMBERS:");
                for(int x = this.start; x<=this.end; x++)
                {
                    if(x%2 != 0)
                        System.out.print(x + " ");
                }
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class OddEvenThread 
{
    public static void main(String[] args) throws InterruptedException
    {
        //USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("Start:\t");int start = sc.nextInt();
        System.out.println("End:\t");int end = sc.nextInt();

        //MULTITHREADING
        MyThread t1 = new MyThread(start,end);
        t1.start();
        try
        {
            t1.join();

        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        MyThread t2 = new MyThread(start,end);
        //t2.start();
        //t2 is automatically run now
        try
        {
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}