package CodingPracticeExercise_250plus_Inheritance;

public class Father extends Grandfather{
    int F_gold = 1000;
    int F_Bank = 2000000;
    int F_Property = 500;

    void F_Function(){
        System.out.println("F-function");
    }
    void home(){
        System.out.println("F-home");
    }
    void p_home(){
        System.out.println("SF-home");
    }
}
