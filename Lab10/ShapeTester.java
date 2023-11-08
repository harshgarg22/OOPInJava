import java.util.*;
import java.lang.*;


abstract class Shape
{
    private String color;
    private boolean filled;

    public Shape()
    {
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){return this.color;}
    public boolean isFilled(){return this.filled;}
    public void setColor(String color){this.color = color;}
    public void setFilled(boolean filled){this.filled = filled;}
    abstract public String toString(); // abstract tostring method
}

class Circle extends Shape
{
    private double radius;

    public Circle()
    {
        super();
        this.radius = 1;
    }
    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){return this.radius;}
    public double getArea()
    {
        double area = 3.14*this.radius*this.radius;
        return area;
    }
    public double getPerimeter()
    {
        double perimeter = 2*3.14*this.radius;
        return perimeter;
    }
    public void setRadius(double radius){this.radius = radius;}
    public String toString()
    {
        String info = "A Circle with radius = " + this.getRadius() + ", which is a subclass of " + super.getClass();
        return info;
    }
}

class Rectangle extends Shape
{
    private double width;
    private double length;
    public Rectangle()
    {
        super();
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){return this.width;}
    public void setWidth(double width){this.width = width;}
    public double getLength(){return this.length;}
    public void setLength(double length){this.length = length;}
    public double getArea()
    {
        double area = this.length*this.width;
        return area;
    }
    public double getPerimeter()
    {
        double perimeter = 2*(this.length + this.width);
        return perimeter;
    }
    public String toString()
    {
        String info = "A Rectangle with width = " + this.getWidth() + "and length = " + this.getLength() + ", which is a subclass of " + super.getClass();
        return info;
    }
}

class Square extends Rectangle
{
    public Square()
    {
        super();
    }
    public Square(double side)
    {
        super(side,side);
    }
    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }
    public void setWidth(double side)
    {
        this.setWidth(side);
        this.setLength(side);
    }
    public void setLength(double side)
    {
        this.setWidth(side);;
        this.setLength(side);
    }
    public String toString()
    {
        String info = "A Square with side = " + this.getWidth() + ", which is a subclass of " + super.getClass();
        return info;
    }

}

class ShapeTester
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:\t");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("The Radius of the circle is:\t" + c.getRadius());
        System.out.println("Area:\t" + c.getArea());
        System.out.println("Enter the new radius:\t");
        double radius1 = sc.nextDouble();
        c.setRadius(radius1);
        System.out.println("The Radius of the circle is:\t" + c.getRadius());
        System.out.println("Circumference:\t" + c.getPerimeter());
        System.out.println("Area:\t" + c.getArea());
        System.out.println("Color:\t" + c.getColor());
        System.out.println("Filled:\t" + c.isFilled());
        System.out.println("Information:\t" + c.toString());

        System.out.println("Enter the length of the rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle");
        double width = sc.nextDouble();
        System.out.println("Enter the colour of the rectangle");
        String color = sc.next();
        System.out.println("Filled or not(T or F):\t");
        boolean filled = sc.nextBoolean();
        Rectangle r = new Rectangle(width, length, color, filled);
        System.out.println("Perimeter:\t" + r.getPerimeter());
        System.out.println("Area:\t" + r.getArea());
        System.out.println("Color:\t" + r.getColor());
        System.out.println("Filled:\t" + r.isFilled());
        System.out.println("Information:\t" + r.toString());
    }
}