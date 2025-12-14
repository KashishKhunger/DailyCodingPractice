package CodingPracticeExercise_250plus;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class codcon_024_secondtoSmallestNumber_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array (eg. {12,13,10} is length 3) :");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i=0 ; i<n ; i++){
            System.out.println("Enter the array element " + i);
             array [i] = sc.nextInt();
        }
        for (int i=0 ; i<n ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int smallest = array[0];
        int second_smallest = Integer.MAX_VALUE;

        for (int i=0 ; i<n ; i++){
            if(smallest > array[i])
                smallest = array[i];
        }
        System.out.println("Smallest number is: " + smallest);

        for( int i:array)
            if (i < second_smallest && i>smallest )
                second_smallest =i;

        System.out.println("Second smallest number is: " + second_smallest);
    }

}
