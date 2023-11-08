import java.util.*;
import java.lang.*;
class ArrayFloat
{
    float[] arr = new float[10];
    public void getFloatNumber()
    {
        System.out.println("Please enter the numbers");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println("Element " + i + ":\t");
            arr[i] = sc.nextFloat();
        }
    }
    public float findMax()
    {
        float temp = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > temp)
            {
                temp = arr[i];
            }
        }
        return temp;
    }
    public float findMin()
    {
        float temp = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] < temp)
            {
                temp = arr[i];
            }
        }
        return temp;
    }

    public float calcAverage()
    {
        float sum = 0.00f;
        for(int i = 0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        float avg = sum/arr.length;
        return avg;
    }
    
}

class ArrayTester
{
    public static void main(String[] args)
    {
        ArrayFloat obj = new ArrayFloat();
        obj.getFloatNumber();
        System.out.println("Max: " + obj.findMax() + "Min: " + obj.findMin());
        System.out.println("Average: " + obj.calcAverage());
    }
}