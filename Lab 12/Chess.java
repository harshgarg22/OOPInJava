import java.util.*;
import java.lang.*;

interface Movable
{
    public void move(String newPos);
}

abstract class ChessPiece implements Movable
{
    String name;
    String color;
    String curPos;
    public ChessPiece(String name, String color, String curPos)
    {
        this.name = name;
        this.color = color;
        this.curPos = curPos;
    }
}

class King extends ChessPiece
{
    public King(String name, String color, String curPos)
    {
        super(name, color, curPos);
    }
    public void move(String newPos)
    {
        System.out.println(this.color + " " + this.name + " " + "moving from " + this.curPos + " to " + newPos);
        this.curPos = newPos;
    }
}
class Queen extends ChessPiece
{
    public Queen(String name, String color, String curPos)
    {
        super(name, color, curPos);
    }
    public void move(String newPos)
    {
        System.out.println(this.color + " " + this.name + " " + "moving from " + this.curPos + " to " + newPos);
        this.curPos = newPos;
    }
}
class Pawn extends ChessPiece
{
    public Pawn(String name, String color, String curPos)
    {
        super(name, color, curPos);
    }
    public void move(String newPos)
    {
        System.out.println(this.color + " " + this.name + " " + "moving from " + this.curPos + " to " + newPos);
        this.curPos = newPos;
    }
}

class Chess
{
    public static void main(String[] args) 
    {
        ArrayList<ChessPiece> arrl = new ArrayList<>(3);
        arrl.add(new King("King", "Black", "a6"));
        arrl.add(new Queen("Queen", "White", "b5"));
        arrl.add(new Pawn("Pawn","Black","e2"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Created 3 Chess Pieces\nKing:1\nQueen:2\nPawn:3");
        while(true)
        {
            System.out.println("Enter which piece to be moved(0 to quit):\n");
            int piece = sc.nextInt();
            if(piece != 0)
            {
                System.out.println("Enter the new position");
                String newPos = sc.next();
                arrl.get(piece-1).move(newPos);
            }
            else if(piece == 0)
            {
                System.out.println("Bye, Thank you");
                break;
            }
        }
    }
}