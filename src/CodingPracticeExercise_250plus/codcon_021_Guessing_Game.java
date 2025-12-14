package CodingPracticeExercise_250plus;

import java.util.Random;
import java.util.Scanner;

public class codcon_021_Guessing_Game {
    public static void main(String[] args) {

        Random random = new Random();
        int ran = random.nextInt(100)+1;

        System.out.println("Guess the number: ");

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess_number;
        do {
            guess_number = scanner.nextInt();

            if (guess_number > ran)
                System.out.println("too high");
            else if (guess_number < ran)
                System.out.println("too low");
                else
                System.out.println("Congratulations! Your guess:  " + guess_number + " is matching with actual number to be guessed : " + ran);

                attempts++;

        }
        while(guess_number!= ran);

        System.out.println("It took you " + attempts + " attemps to guess it.");


    }
}
