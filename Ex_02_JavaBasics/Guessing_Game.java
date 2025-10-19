package Ex_02_JavaBasics;

import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {
    public static void main(String[] args) {
    Random random =new Random();
    int random_number = random.nextInt(100);
    //    System.out.println(random_number);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Guess: ");
        int guess;
        int attempts = 0;

        while(true) {
            if(!scanner.hasNextInt()){
                System.out.println("Enter a Valid integer");
                System.out.println("Enter the Guess: ");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100){
                System.out.println("Enter value between 1 to 100");
                continue;
            }
            if (guess < random_number){
                System.out.println("Guessed Number is lower than actual number");

            }else if (guess>random_number) {
                System.out.println("Guessed Number is higher than actual number");
            }else {
                System.out.println("Your Guessed the number correct in " + attempts + " attempts and " + guess + " is the correct guess");
                break;
            }
        }





    }
}
