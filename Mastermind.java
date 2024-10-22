import java.util.Random;
import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {

        // Print Instructions
        System.out.println("Welcome to Mastermind! You have 10 guesses, and you will guess 4 number between 1 and 6. \nType 'quit' to exit the program");
        // int turns = 10;

        // Random 4 digit numbers
        Random random = new Random();
        int min = 1, max = 6;
        int rand_int1 = random.nextInt(max - min + 1) + min;
        int rand_int2 = random.nextInt(max - min + 1) + min;
        int rand_int3 = random.nextInt(max - min + 1) + min;
        int rand_int4 = random.nextInt(max - min + 1) + min;
        

        String total = String.valueOf(rand_int1) + String.valueOf(rand_int2) + String.valueOf(rand_int3) + String.valueOf(rand_int4);
        
        // Prompt user to input a 4 digit number guesses
        String userInput;
        boolean userWins = false;

        Scanner scanner = new Scanner(System.in);

        for (int turns = 10; turns > 0; turns--) {

            System.out.println("\nYou have " + turns + " guesses left.");
            System.out.println("\nPlease guess your 4 digit number (1-6): ");
            userInput = scanner.nextLine();

            if(userInput.equals("quit")) {
                System.out.println("Exiting program");
                break;
            }

            for (int i = 0; i < 4; i++) {
                if (!((userInput.charAt(i) >= 49) && (userInput.charAt(i) <= 54))) {
                    System.err.println("Invalid character detected...");
                    break;
                }
            }

            if (!userInput.equals(String.valueOf(total))) {
                System.out.println("Wrong Answer");
            }

            else {
                System.out.println("You guessed it!");
                break;
            }


            // To check if the guesses are correct or not
            int numPo = 0;
            int num = 0;
            String correctAnswer = total;

            char[] correctAnswerArray = correctAnswer.toCharArray();
            boolean[] usedInExactMatch = new boolean[4]; // Track digits used in exact matches
            boolean[] usedInPartialMatch = new boolean[4]; // Track digits used in partial matches

            // Check exact matches (number and position)
            for (int j = 0; j < 4; j++) {
                if (String.valueOf(userInput.charAt(j)).equals(String.valueOf(total.charAt(j)))) {
                    numPo++;
                    usedInExactMatch[j] = true; // Mark as used in exact match
                }
            }

            // Second loop: Check number match but wrong position
            for (int k = 0; k < 4; k++) {
                if (!usedInExactMatch[k]) {  // Skip already matched exact positions
                    for (int m = 0; m < 4; m++) {
                        if (!usedInExactMatch[m] && !usedInPartialMatch[m] && userInput.charAt(k) == correctAnswerArray[m]) {
                        num++;
                        usedInPartialMatch[m] = true; // Mark as used in partial match
                        break; // Move to next userInput char after match
                        }
                    }
                }
            }

            System.out.println("Exact number and position matched: " + numPo);
            System.out.println("Number matched but wrong position: " + num);
            
            if (turns == 0) {
                System.out.println("Game over! You've used all your turns");
                break;
            }
            
            /* if (numPo == 4) {
                System.out.println("You win!");
                userWins = true;
            }

            if (userWins) {
                random = new Random();
                rand_int1 = random.nextInt(max - min + 1) + min;
                rand_int2 = random.nextInt(max - min + 1) + min;
                rand_int3 = random.nextInt(max - min + 1) + min;
                rand_int4 = random.nextInt(max - min + 1) + min;

                total = String.valueOf(rand_int1) + String.valueOf(rand_int2) + String.valueOf(rand_int3)
                        + String.valueOf(rand_int4);
                userWins = false;
            } */
        }

        System.out.println("\nThe number is: " + rand_int1 + rand_int2 + rand_int3 + rand_int4);

    }
}