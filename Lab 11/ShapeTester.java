import java.util.*;
import java.lang.*;

interface Drawable
{
    public void draw();
}

class Rectangle implements Drawable
{
    public void draw()
    {
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<10; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

class Triangle implements Drawable
{
    public void draw()
    {
        for (int i = 0; i<5; i++)
        {
            for(int j = 1; j<=i+1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("**Circle drawn**");


    }
}

/**
 * ShapeTester
 */
public class ShapeTester 
{

    public static void main(String[] args) 
    {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (1: Circle, 2: Rectangle; 3: Triangle):\n");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:c1.draw();
                break;
            case 2:r1.draw();
                break;
            case 3:t1.draw();
                break;
            default:System.out.println("Enter a valid choice!");
                break;
        }

    }
}