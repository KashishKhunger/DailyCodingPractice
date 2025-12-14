package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_025_Array_For_Loops_Star_Patterns {

    public static void main(String[] args) {
        // Right Triangle

        System.out.println("enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("---------------------------");

        for(int i=1 ; i<=rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        // Inverse Right Triangle
        System.out.println("---------------------------");

        for(int i=1 ; i<=rows; i++) {
            for (int j = rows; j >= i; j--) {
         //       if((i+j)>=(rows-1))
                System.out.print("* ");
            }
            System.out.println("");
        }
        // Left Triangle
        System.out.println("---------------------------");

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Inverse Left Triangle
        System.out.println("---------------------------");

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            // Print asterisks
            for (int k = 1; k <= rows-i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Pyramid
        System.out.println("---------------------------");

        for(int i=1 ; i<=rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        // Inverse Pyramid
        // Double Pyramid
    }

}
