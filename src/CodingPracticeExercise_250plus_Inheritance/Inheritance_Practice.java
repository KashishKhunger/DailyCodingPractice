package CodingPracticeExercise_250plus_Inheritance;

public class Inheritance_Practice {
    public static void main(String[] args) {
        Grandfather gf1 = new Grandfather();
        Father f1 = new Father();
        Mother m1 = new Mother();
        Son s1 = new Son();

        gf1.GF_Function();
        f1.F_Function();
        m1.M_Function();
        s1.S_Function();

        // Inheritance - Son extends from Father and Father extends from Grandfather
        System.out.println(f1.GF_gold);
        System.out.println(s1.F_Property);
        System.out.println(s1.GF_Bank);

        //Dynamic Reference or Dynamic method Dispatch or Dynamic Binding or Dynamic Dispatch
        Grandfather gf2 = new Son();
        gf2.home();

        // The Diamond Problem - why multiple Inheritance is not supported

        // If Son extends from Father and Mother then if we call p_home function to access parent's home
        // then which p_home function will be called , Mother's or Father's ?


    }
}
