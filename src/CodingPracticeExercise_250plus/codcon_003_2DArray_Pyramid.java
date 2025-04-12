package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_003_2DArray_Pyramid {
    public static void main(String[] args) {

//        Take user input
        System.out.println("Enter number of rows:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

//        Pyramid
        System.out.println("---------------------------------------------");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

//       Inverse Pyramid
        System.out.println("---------------------------------------------");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

//       double Pyramid
        System.out.println("---------------------------------------------");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

       for (int i = rows-1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        }

    }

