import java.util.Random;
import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {

        Random random = new Random();
        int min = 1, max = 6;
        int rand_int1 = random.nextInt(max - min + 1) + min;
        int rand_int2 = random.nextInt(max - min + 1) + min;
        int rand_int3 = random.nextInt(max - min + 1) + min;
        int rand_int4 = random.nextInt(max - min + 1) + min;
        System.out.println("The number is: "+ rand_int1 + rand_int2 + rand_int3 + rand_int4);

        while(true) {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess your 4 digit number (1-6): ");
        userInput = scanner.nextLine();
        }

        // scanner.close();
    }

}