package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_016_Fibonacci_series {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scanner.nextInt();
        int sum;
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i < n; i++) {
            sum = first + second; // 2
            System.out.println(sum);
            first= second;
            second = sum;

        }
    }
}
