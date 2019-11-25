import java.util.Scanner;

public class JavaWorkshop
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
      Scanner input = new Scanner(System.in);
      System.out.println("The troll won't let you pass until you guess his number, which is between 1 and 3, correctly.");
      
      int userGuess = input.nextInt();
      int trollNum = (int)(Math.random() * 3) + 1;
      
      if(userGuess == trollNum)
         System.out.println("Congratulations! You beat the troll! On to the next challenge!");
      else
      {
         System.out.println("Uh-oh! You lost!");
         System.exit(0);
      }
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
      Scanner input = new Scanner(System.in);
      System.out.println("You made it to your next obstacle! A witch casts a spell on you! What do you do?" +
         "\n1 - Use a sword \n 2 - Use a shield \n 3 - Dip. I'm not in the mood to deal with a witch");
      
      int choice = input.nextInt();
      
      if(choice == 1)
      {
         System.out.println("The witch flew away before you could use the sword! You've been hexed. Try again.");
         System.exit(0);
      } else if (choice == 2)
      {
         System.out.println("The spell deflected off your sword! Forward!");
      } else {
         System.exit(0);
      }
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
      Scanner input = new Scanner(System.in);
      
      System.out.println("Oh no! The sphinx! Solve the riddle: " +
         "What creature walks on four legs in the morning, two in the afternoon, and three in the evening? (one word answer)");
         
      String answer = input.nextLine();
      
      if(answer.equalsIgnoreCase("man") || answer.equalsIgnoreCase("human") || answer.equalsIgnoreCase("homosapien"))
         return "You've won! Congratulations!";
      else
         return "You lost! Try again!";
   }
}