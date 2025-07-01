package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_014_CLI_UserInput_even_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's even or odd -> ");
        int input = scanner.nextInt();
        //even or odd check
        if (input%2 == 0){
            System.out.println("The number entered is EVEN");
        }
        else
            System.out.println("The number entered is ODD");
    }
}
