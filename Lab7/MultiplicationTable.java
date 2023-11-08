import java.util.*;
import java.lang.*;

class MultiplicationTable
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:\t");
        int n = sc.nextInt();
        MultiplicationTable.printTable(n);
    }
    public static void printTable(int n)
    {
        for(int i = 1; i<=n; i++) //for loop for the rows
        {
            for(int j = 1; j<=10; j++) // for loop for the columns
            {
                System.out.printf("%3d ", i*j);
            }
            System.out.println();
        }
    }
}

