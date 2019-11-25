import java.util.Scanner;

public class GameChallenge
{
   /*Entrance into the game:
    *Print out a line that greets the player
    *add three methods that serve as three challenges
    */
   public static void main(String[] args)
   {
      System.out.println("Welcome to the battle. Can you beat the dragon?");
      challengeOne();
      challengeTwo();
      System.out.println(challengeThree());
      System.exit(0);
   }
   
   /*Challenge one:
    *create a scanner
    *choose an obstacle and print out a challenge where the user guesses a number between 1 to 3
    *save user's guess
    *using Math.random(), save the obstacle's password/number (also between 1 to 3)
    *compare: if correct, move forward, if incorrect, System.exit();
    */
   public static void challengeOne()
   {
      
   }
   
   /*Challenge two:
    *create a scanner
    *choose an obstacle and print out a challenge where the user chooses a number between 1 to 3 which represent a weapon
    *save user's guess
    *use == to determine what the outcome is of each number
    *compare: if correct, move forward, if incorrect, System.exit();
    */
   public static void challengeTwo()
   {
      
   }
   
   /*Challenge three:
    *create a scanner
    *choose an obstacle and print out a riddle with a one word answer
    *save user's guess
    *use String's equals method to see if the answer is correct
    *compare: if correct, win! if incorrect, System.exit();
    */
   public static String challengeThree()
   {
      
   }
}