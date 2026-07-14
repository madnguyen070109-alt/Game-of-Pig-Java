import java.util.Scanner;
public class Pig
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int points = 0;
        int compPoints = 0;
        int turn = 1;
        int compTurn = 1;
        while (points<100)
        {
            int roundPoints = 0;
            int compRound = 0;
            System.out.println("Turn " + turn);
            System.out.println("Your Current Score is: " + points);
            System.out.println("Computer Current Score is: " + compPoints);
            int rollNum = 0;
            while (true)
            {
                
                System.out.println("This round you have: " + roundPoints);
                System.out.println("Would you like to roll or bank?");
                String roll = input.nextLine();
                if (roll.equals("roll"))
                {
                    rollNum = (int)(Math.random() * (6) + 1);
                    System.out.println("");
                    System.out.println("You rolled a " + rollNum);
                    if (rollNum != 1)
                    {
                        roundPoints += rollNum;
                    }
                    else
                    {
                        System.out.println("You rolled a 1! You get a zero for this round!");
                        turn++;
                        break;
                    }
                }
                else
                {
                    points += roundPoints;
                    turn++;
                    break;
                }
                
            }
            while (true)
            {
                System.out.println("");
                if (compRound < 15)
                {
                    rollNum = (int)(Math.random() * (6) + 1);
                    System.out.println("The computer rolled a " + rollNum);
                    if (rollNum != 1)
                    {
                        compRound += rollNum;
                        System.out.println("This round the computer has: " + compRound);
                        if (compRound != 0)
                        {
                            System.out.println("The computer chooses to roll again");
                        }
                    }
                    else
                    {
                        System.out.println("The computer rolled a 1. End of turn");
                        compRound = 0;
                        compTurn++;
                        break;
                    }
                }
                else
                {
                    compPoints += compRound;
                    compTurn++;
                    break;
                }
                System.out.println("");
            }
            
        }
        if (compPoints > 100 && compPoints > points)
        {
            System.out.println("Good try! The Computer won on " + compTurn + " turns.");
        }
        else
        {
            System.out.println("Congratulations! You won on " + turn + " turns.");
        }
    }
}
