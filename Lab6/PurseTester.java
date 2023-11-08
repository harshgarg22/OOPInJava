import java.util.*;
import java.lang.*;

class Purse
{
    private int dirhams;
    private int fiftyFills;
    private int twentyFiveFills;
    private double total;

    public Purse(int dirhams, int fiftyFills, int twentyFiveFills, double total)
    {
        this.dirhams = dirhams;
        this.fiftyFills = fiftyFills;
        this.twentyFiveFills = twentyFiveFills;
        this.total = this.totalCash();
    }
    public void addDirham(int dirham)
    {
        this.dirhams += dirham;
    }
    public void removeDirham(int dirham)
    {
        this.dirhams -= dirham;
    }
    public void addFiftyFills(int fiftyFills)
    {
        this.fiftyFills += fiftyFills;
    }
    public void removeFiftyFills(int fiftyFills)
    {
        this.fiftyFills -= fiftyFills;
    }
    public void addTwentyFiveFills(int twentyFiveFills)
    {
        this.twentyFiveFills += twentyFiveFills;
    }
    public void removeTwentyFiveFills(int twentyFiveFills)
    {
        this.twentyFiveFills -= twentyFiveFills;
    }
    public double totalCash()
    {
        double total = (this.dirhams) + (this.fiftyFills*0.5) + (this.twentyFiveFills*0.25);
        return total;
    }
    public int getDirhams(){return this.dirhams;}
    public int getFiftyFills(){return this.fiftyFills;}
    public int getTwentyFiveFills(){return this.twentyFiveFills;}
}

class PurseTester
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Initial Dirham:\t");
        int dirham = sc.nextInt();
        System.out.println("Initial 50 Fills:\t");
        int fills50 = sc.nextInt();
        System.out.println("Initial 25 Fills:\t");
        int fills25 = sc.nextInt();
        double total = 0;
        Purse purse = new Purse(dirham, fills50, fills25, total);
        System.out.println("Dirhams:\t" + purse.getDirhams() );
        System.out.println("50 fills:\t" + purse.getFiftyFills());
        System.out.println("25 fils:\t" + purse.getTwentyFiveFills());
        System.out.println("Total:\t" + purse.totalCash());

        System.out.println("Remove Dirham:\t");
        int rdirham = sc.nextInt();
        System.out.println("Remove 50 Fills:\t");
        int rfills50 = sc.nextInt();
        System.out.println("Remove 25 Fills:\t");
        int rfills25 = sc.nextInt();
        purse.removeDirham(rdirham);
        purse.removeFiftyFills(rfills50);
        purse.removeTwentyFiveFills(rfills25);
        System.out.println("Dirhams:\t" + purse.getDirhams() );
        System.out.println("50 fills:\t" + purse.getFiftyFills());
        System.out.println("25 fils:\t" + purse.getTwentyFiveFills());
        System.out.println("Total:\t" + purse.totalCash());

    }
}