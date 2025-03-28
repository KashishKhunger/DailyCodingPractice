package CodingPracticeExercise_250plus;

public class codcon_002_oddEvenFromAnArray {
    public static void main(String[] args) {
//        define an array
        int[] array = {1,4,7,23,46,87,98,257,123,100};
//        loop through array and find even/odd
        for (int i=0; i< array.length; i++){

            if (array[i] % 2 == 0)
                System.out.println(array[i] + " is even" );
            else
                System.out.println(array[i] + " is odd");


        }
    }
}
