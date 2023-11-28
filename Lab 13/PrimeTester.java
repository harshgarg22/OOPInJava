import java.util.*;
import java.lang.*;

class Prime
{
    int n1,n2;
    public Prime(int n1, int n2)
    {
        this.n1 = n1; this.n2 = n2;
    }
    public boolean checkPrime(int n)
    {
        int flag = 0;
        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
            {
                flag ++;
            }
        }
        if(flag == 2)
            return true;
        else
            return false;
    }
    public void generateNums() throws MyException
    {
        try
        {
            if(n1>0 && n2>0)
            {
                int flag = 0;
                System.out.println("PRIME NUMBERS ARE:\n");
                for(int i =n1;i<=n2; i++)
                {
                    if(this.checkPrime(i)){
                        System.out.printf("%d\n",i);
                    }
                }
            }
            else
            {
                throw new MyException("The numbers entered are negative");
            }
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
class PrimeTester
{
    public static void main(String[] args) throws MyException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");int n1 = sc.nextInt();
        System.out.println("Enter number 2");int n2 = sc.nextInt();
        Prime p = new Prime(n1, n2);
        p.generateNums();

    }
}