package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_020_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to do factorial:");
        int n = sc.nextInt();
//        n=0  -> 0! = 1
//        n=1  -> 1! = 1
//        n=2  -> 2! = 2*1 = 2
//        .
//        .
//        .
//        n=5  -> 5! = 5*4*3*2*1 = 120

        int mul = 1;

        for(int i=n; i>=1  ; i--){
            mul = mul*i;
        }
        System.out.println("Factorial of " + n + " = " + mul);

        // Using while loop

        int factorial = 1 ;

        int i=n;
        while(i>=1){
            factorial = factorial * i ;
            i--;
        }

        System.out.println(factorial);

    }
}
