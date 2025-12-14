package CodingPracticeExercise_250plus;

public class codcon_026_Polymorphism {
// same name function many forms/functionalities
public static void main(String[] args) {
    Father father = new Father();
    father.Home();
    father.Home(3); //complile-time polymorphism/method overloading
    father.Home(4);

    Father f1 = new Son();
    f1.Home(); //run-time polymorphism/method overriding
}

}

class Father{
    int age;
    String name;

    void Home(){
        System.out.println("It's Father's home!");
    }

    void Home(int num_rooms){
        System.out.println("This is father's home with " + num_rooms + " rooms!");
    }
}

class Son extends Father {
    String s_name;
    int s_age;

    @Override
    void Home(){
        System.out.println("It's son's Home!");
    }
}
