import java.util.*;
import java.lang.*;

class Sum extends Thread
{
    private int start;
    private int end;
    static int result;
    public Sum(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run()
    {
        try
        {
            int sum = 0;
            //System.out.println(this.start + " " + this.end);
            for(int i = this.start; i<=this.end; i++)
            {
                sum+=i;
            }
            result += sum;
            System.out.println("The result after thread being run is:"  + result);
            //System.out.println(sum);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class SumToN
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:\t"); int num = sc.nextInt();
        System.out.println("Enter n:\t"); int n = sc.nextInt();
        
        Sum[] s = new Sum[num/n];
        for(int i = 0; i<n; i++)
        {
            s[i] = new Sum((i*(num/n) + 1),((i+1)*num/n));
            //Thread t = new Thread(s[i]);
            //t.start();
            //Sum s = new Sum((i*(num/n) + 1),((i+1)*num/n));
            s[i].start();
        }
    }
}