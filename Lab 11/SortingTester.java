import java.util.*;
import java.lang.*;

interface Sortable
{
    public void sort(int[] nums);
}

class SelectionSort implements Sortable
{
    public void sort(int[] nums)
    {
        
        for(int i = 0; i<nums.length; i++)
        {
            int minElement = nums[i];
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[j]<minElement)
                    minElement = nums[j];
            }
            nums[i] = minElement;
        }
        System.out.println("\nAfter Selection Sort:\n");
        for(int i =0; i<nums.length; i++)
        {
            System.err.print(nums[i]);
        }
        
    }
}

class BubbleSort implements Sortable
{
    public void sort(int[] nums)
    {
        for(int parse = 0; parse<(nums.length - 1); parse++)
        {
            for(int i = 0; i<(nums.length-1);i++)
            {
                if(nums[i] > nums[i+1])
                {
                    int t = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = t;
                }
            }
        }
        System.out.println("After using Bubble Sort:\n");
        for(int i =0; i<nums.length; i++)
        {
            System.err.print(nums[i]);
        }
    }
}
class SortingTester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:\n");
        for(int i = 0; i<n; i++)
        {
            System.out.printf("Element %d:\t",i);
            nums[i] = sc.nextInt();
        }

        BubbleSort bs = new BubbleSort();
        bs.sort(nums);
        SelectionSort ss = new SelectionSort();
        ss.sort(nums);
    }
}