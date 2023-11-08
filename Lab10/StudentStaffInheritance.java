import java.util.*;
import java.lang.*;

class Person
{
    private String name;
    private String address;
    
    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String toString()
    {
        String information = this.getClass() +"[name = " + this.getName() + ", address = " + this.getAddress() + "]";
        return information;
    }
}

class Student extends Person
{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee)
    {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram()
    {
        return this.program;
    }
    public void setProgram(String program)
    {
        this.program = program;
    }
    public int getYear()
    {
        return this.year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public double getFee()
    {
        return this.fee;
    }
    public void setFee(double fee)
    {
        this.fee = fee;
    }
    public String toString()
    {
        String information = this.getClass() + "[" + super.toString() + ", program = " + this.getProgram() + ", year = " + this.getYear() + ", fee = " + this.getFee() + "]";
        return information; 
    }
}

class Staff extends Person
{
    private String school;
    private double pay;
    public Staff(String name, String address, String school, double pay)
    {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool()
    {
        return this.school;
    }
    public void setSchool(String school)
    {
        this.school = school;
    }
    public double getPay()
    {
        return this.pay;
    }
    public void setPay(double pay)
    {
        this.pay = pay;
    }
    public String toString()
    {
        String information = this.getClass() + "[" + super.toString() + ", school = " + this.getSchool() + ", pay = " + this.getPay() + "]";
        return information; 
    }
}

class StudentStaffInheritance
{
    public static void main(String[] args) 
    {

        Student s = new Student("Joel", "B116", "CS", 2, 60000);
        s.setProgram("ECE");
        s.setAddress("B304");
        s.setFee(1000000);
        System.out.println(s.toString());

        Staff s1 = new Staff("Casey", "A781", "BPDC", 10000);
        s1.setAddress("International City");
        s1.setPay(12500);
        s1.setSchool("Amity");
        System.out.println(s1.toString());
    }
}