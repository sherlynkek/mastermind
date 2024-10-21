import java.util.Random;
import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {

        // Print Instructions
        System.out.println("Welcome to Mastermind! You have 10 guesses, and you will guess 4 number between 1 and 6");
        // int turns = 10;

        // Random 4 digit numbers
        Random random = new Random();
        int min = 1, max = 6;
        int rand_int1 = random.nextInt(max - min + 1) + min;
        int rand_int2 = random.nextInt(max - min + 1) + min;
        int rand_int3 = random.nextInt(max - min + 1) + min;
        int rand_int4 = random.nextInt(max - min + 1) + min;
        System.out.println("\nThe number is: " + rand_int1 + rand_int2 + rand_int3 + rand_int4);

        // Prompt user to input a 4 digit number guesses
        int total = Integer.valueOf(String.valueOf(rand_int1) + String.valueOf(rand_int2) + String.valueOf(rand_int3) + String.valueOf(rand_int4));
        int userInput;

        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("\nPlease guess your 4 digit number (1-6): ");
            userInput = Integer.parseInt(scanner.nextLine());
            
            try {
                if(Integer.toString(userInput).length() != 4) {
                    throw new IllegalArgumentException("Input must be exactly 4 digits.");
                }

                if (userInput != total) {
                    System.out.println("Wrong Answer");

                // To check if the guesses are correct or not
                for (int i = 0; i < 4; i++) {
                    System.out.println("Position: ");
                }
                }
                else {
                    System.out.println("You guessed it!");
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid 4-digit number.");
            } 
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        // scanner.close();

        }

    }
}