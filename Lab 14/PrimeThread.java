import java.util.*;
import java.lang.*;

class Prime extends Thread
{
    public int start,end;
    public static int result;
    public Prime(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
    public static int checkPrime(int n)
    {
        int flag = 0;
        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
                flag++;
        }
        if(flag == 2)
            return 1;
        else 
            return 0;
    }
    @Override
    public void run()
    {
        try
        {
            int sum = 0;
            for(int i = this.start; i<=this.end; i++)
            {
                if(checkPrime(i) == 1)
                    sum+=i;
            }
            result += sum;
            System.out.println("After the thread got executed, Sum = " + result);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class PrimeThread{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:\t"); int num = sc.nextInt();
        System.out.println("Enter the number of threads:\n"); int n = sc.nextInt();
        
        Prime[] p = new Prime[num/n];
        for(int i = 0; i<n; i++)
        {
            p[i] = new Prime((i*(num/n) + 1), ((i+1)*(num/n)));
            p[i].start();
            try
            {
                p[i].join();
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}