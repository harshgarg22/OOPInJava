import java.util.*;
import java.lang.*;

abstract class Car // Creating an abstract Class
{
    double price;
    int year;

    public Car(double price, int year)
    {
        this.price = price;
        this.year = year;
    }
    abstract double calculateSalePrice(); // Abstract method: Defined in subclasses
}

class ClassicCar extends Car
{
    public ClassicCar(double price, int year)
    {
        super(price, year);
    }
    double calculateSalePrice()
    {
        return 10000;
    }
}

class SportCar extends Car
{
    public SportCar(double price, int year)
    {
        super(price, year);
    }
    double calculateSalePrice()
    {
        if(this.year >= 2000)
        {
            double salePrice = 0.75*this.price;
            return salePrice;
        }
        else if(this.year>= 1995 && this.year <2000)
        {
            double salePrice = 0.5*this.price;
            return salePrice;
        }
        else
        {
            double salePrice = 0.25*this.price;
            return salePrice;
        }
    }
}

class CarTester
{
    public static void main(String[] args) 
    {
        ClassicCar cc = new ClassicCar(12000, 2005);
        SportCar sc = new SportCar(10000, 2010);
        System.out.println(cc.getClass() + "Price:\t" + cc.calculateSalePrice());
        System.out.println(sc.getClass() + "Price:\t" + sc.calculateSalePrice());    
    }
}