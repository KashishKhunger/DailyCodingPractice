package CodingPracticeExercise_250plus;

public class codcon_011_In_De_Operator {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + a++ + a++); // 11 + 11 + 12 = 34
        System.out.println(a);                  // 11->12->13 a=13
    }
}
