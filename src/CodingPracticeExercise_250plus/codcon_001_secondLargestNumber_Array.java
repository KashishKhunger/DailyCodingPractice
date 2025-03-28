package CodingPracticeExercise_250plus;

public class codcon_001_secondLargestNumber_Array {
    public static void main(String[] args) {

        int[] array = {1,2,3,5,6,7,8,19,100,4 };

        int max =0;
        int sec_max = 0;

        //sorting the array
        for(int i=0 ; i< array.length; i++){
            if(max<array[i]) {
                max = array[i];
            }
        }

        for(int j=0 ; j< array.length; j++){
            if(sec_max<array[j] & array[j] != max)
                sec_max = array[j];
        }
        System.out.println(sec_max);
    }

}
