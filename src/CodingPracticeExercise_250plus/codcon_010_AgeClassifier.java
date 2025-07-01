package CodingPracticeExercise_250plus;

public class codcon_010_AgeClassifier {

    public static void main(String[] args) {
       String age_CLI = args[0];
       int age = Integer.parseInt(age_CLI);

       String result = (age<18) ? "minor" : (age>65) ?"senior" : "adult";

       System.out.println("Person with age:" + age + " is " + result);
    }
}
