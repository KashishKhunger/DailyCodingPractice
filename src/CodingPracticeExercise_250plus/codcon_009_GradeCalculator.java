package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_009_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the score");
        int score = scanner.nextInt();

        String Grade = score>=90? "A" : score>=80? "B": score>= 70? "C": score>=60? "D" : "F";

        System.out.println(Grade);
    }
}
