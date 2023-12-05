import java.util.*;
import java.lang.*;

class MyThread extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Hello World");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class HelloWorldThread
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();
    }
}