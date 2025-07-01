package CodingPracticeExercise_250plus;

public class codcon_012_CLI_UserInputs {
    public static void main(String[] args) {

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        float salary = Float.parseFloat(args[2]);

        System.out.println("Name: " + name  + " \nAge: " + age + "\nSalary: " + salary );

    }
}
