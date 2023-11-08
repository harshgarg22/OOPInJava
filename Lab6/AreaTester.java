import java.util.*;
import java.lang.*;

class Area
{
    private float side1;
    private float side2;
    public Area(float side1, float side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }
    public float getSide1(){return this.side1;}
    public float getSide2(){return this.side2;}
    public int calcArea(int side)
    {
        return side*side;
    }
    public double calcArea(float radius)
    {
        double area = 3.14*radius*radius;
        return area;
    }
    public double calcArea(float length, float breadth)
    {
        return length*breadth;
    }
}
class AreaTester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side:\t");
        float side1 = sc.nextFloat();
        System.out.println("Enter the second side:\t");
        float side2 = sc.nextFloat();
        Area obj = new Area(side1, side2);

        System.out.println("Enter the side of the square:\t");
        int side = sc.nextInt();
        System.out.println("Area:\t" + obj.calcArea(side));

        System.out.println("Enter the radius of the circle:\t");
        float radius = sc.nextFloat();
        System.out.println("Area:\t" + obj.calcArea(radius));

        System.out.println("Area of Rectangle:\t" + obj.calcArea(obj.getSide1(), obj.getSide2()));

    }
}