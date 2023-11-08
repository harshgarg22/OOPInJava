import java.util.*;
import java.lang.*;

class FlightDest
{
    private String flightNo;
    private String destination;
    public FlightDest(String fNo, String dest)
    {
        this.flightNo = fNo;
        this.destination = dest;
    }
    public String getflightNo()
    {
        return this.flightNo;
    }
    public String getDestination()
    {
        return this.destination;
    }
}

class FlightInfo
{
    ArrayList <FlightDest> FlightDestList = new ArrayList <FlightDest> ();
    public void addFlightDestPair(String fNo, String dest)
    {
        FlightDest d = new FlightDest(fNo,dest);
        FlightDestList.add(d);
    }
    public void getFlightDest(String dest)
    {
        
        for(FlightDest f: FlightDestList)
        {
            if(f.getDestination().equals(dest))
            {
                System.out.println(f.getflightNo());
            }
        }
    }
}

class FlightDestinationTester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        FlightInfo obj1 = new FlightInfo();
        obj1.addFlightDestPair("E456", "Mumbai");
        obj1.addFlightDestPair("AI459", "Delhi");
        obj1.addFlightDestPair("VQ343", "Hyderabad");
        obj1.addFlightDestPair("AI888", "Mumbai");
        System.out.println("Enter the destination:\t");
        String userDestination = sc.nextLine();
        obj1.getFlightDest(userDestination);
    }
}

