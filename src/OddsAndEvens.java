import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {

        // create Scanner
        Scanner input = new Scanner(System.in);
        // Introduce user; Collect Name, Odd/Even input from user
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        // Declare string name as user input
        String name = input.nextLine();
        // Display user name and choice as well as computer choice
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();
        // Determine if user entered valid input
        do
        {
            if (choice.length() > 1) {
                System.out.println("Please select either \"O\" or \"E\".");
                return;
            }

        } while (choice.length() != 1);
        if (choice.equalsIgnoreCase("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (choice.equalsIgnoreCase("E")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("---------------------------------");

        // -----------------------------------------------------------


        // Ask for number how many fingers player will use
        System.out.print("How many \"fingers\" do you put out? ");

        // Get user input
        int playerChoice = input.nextInt();

        // Declare random variable
        Random rand = new Random();
        // Set computer to randomized choice
        int computer = rand.nextInt(6);
        // Display computer choice
        System.out.println("The computer plays " + computer + " \"fingers\".");
        System.out.println("---------------------------------");

        // Sum up player and computer choice
        int sum = playerChoice + computer;
        System.out.println(playerChoice + " + " + computer + " = " + sum);
        // Determine if Odd or Even
        boolean oddOrEven = sum % 2 == 0;

        // If Even, display the total as Even
        if (oddOrEven) {
            System.out.println(sum + " is ...even!");
        // If Odd, display sum as Odd
        } else {
            System.out.println(sum + " is ...odd!");
        }
        System.out.println("---------------------------------");

        // -----------------------------------------------------------

        // If sum is Even, then execute either
        if (oddOrEven) {
            // If playerChoice is Even, then player wins
            if (choice.equalsIgnoreCase("E")) {
                System.out.println("That means " + name + " wins! :)");
            // If playerChoice is Odd then computer wins
            } else {
                System.out.println("The computer wins. :(");
            }
        // Else sum being Odd, then execute either
        } else {
            // If playerChoice is Odd, then player wins
            if (choice.equalsIgnoreCase("O")) {
                System.out.println("That means " + name + " wins! :)");
            // If playerChoice is Even, then computer wins
            } else {
                System.out.println("The computer wins. :(");
            }
        }
    }
}
