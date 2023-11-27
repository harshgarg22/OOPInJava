import java.lang.*;
import java.util.*;
abstract class Member
{
    String name;
    String address;
    public Member(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    abstract public String getName();
    abstract public String getAddress();
    abstract public int getFee();
}

class StandardMember extends Member
{
    int fee;
    public StandardMember(String name, String address, int fee)
    {
        super(name, address);
        this.fee = fee;
    }
    public String getName(){return this.name;}
    public String getAddress(){return this.address;}
    public int getFee(){ return this.fee;}

}

class SeniorMember extends Member
{
    int fee;
    public SeniorMember(String name, String address, int fee)
    {
        super(name, address);
        this.fee = fee;
    }
    public String getName(){return this.name;}
    public String getAddress(){return this.address;}
    public int getFee(){ return this.fee;}
}

class Society
{
    ArrayList <Member> members = new ArrayList<>();
    public void addMember(String name, String address, int fee)
    {
        members.add(new StandardMember(name, address, fee));
    }
    public void addSeniorMember(String name, String address, int fee)
    {
        members.add(new SeniorMember(name, address, fee));
    }
    public int getFeeTotal()
    {
        int fee = 0;
        for(Member m: members)
        {
            fee+= m.getFee();
        }
        return fee;
    }   
}

class SocietyTester
{
    public static void main(String[] args) 
    { 
        Society s = new Society();
        s.addMember("Harsh", "Hyderabad", 1000);
        s.addMember("Joel", "Abu Dhabi", 1000);
        s.addSeniorMember("Sujala", "Dubai", 1500);
        s.addSeniorMember("Utkarsh", "Kanpur", 1500);
        System.out.println("Total fee:\t" + s.getFeeTotal());
    }
}
