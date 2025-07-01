package CodingPracticeExercise_250plus;

public class codcon_013_CLI_Max_TernaryOperator {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int max = num1>num2?num1:num2 ;

        System.out.println("Max of num1 & num2 = " + max);

    }
}
