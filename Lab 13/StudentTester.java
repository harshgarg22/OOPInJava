import java.util.*;
import java.lang.*;

class Student
{
    private String name;
    private int age;
    private int year;
    private String idno;

    public Student(String name, int age, int year, String idno)
    {
        this.name = name;
        this.age = age;
        this.year = year;
        this.idno = idno;
    }

    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public int getYear(){return this.year;}
    public String getIdNo(){return this.idno;}

    public void checkName() throws MyException
    {
        try
        {
            int flag = 0;
            for(int i = 0; i<this.name.length(); i++)
            {
                char c = this.name.charAt(i);
                if(Character.isUpperCase(c) || Character.isLowerCase(c))
                {
                    flag++;
                }
            }
            if(flag == this.name.length())
            {
                System.out.println("The name is Valid");
            }
            else
            {
                throw new MyException("Name is Invalid");
            }
        }
        catch(MyException exception)
        {
            System.out.println(exception.getMessage());
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

class StudentTester
{
    public static void main(String[] args) throws MyException
    {
        Student s1 = new Student("HarshGarg", 19, 2005, "2022A7PS0246U");
        Student s2 = new Student("123", 19, 2001, "2022A7PS0213U");
        s1.checkName();
        s2.checkName();
    }
}