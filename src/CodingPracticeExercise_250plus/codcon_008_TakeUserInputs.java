package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_008_TakeUserInputs {
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Profession:");
        String profession = scanner.nextLine();
        System.out.println(profession);

        System.out.println("Age:");
        int age = scanner.nextShort();
        System.out.println(age);

    }
}
