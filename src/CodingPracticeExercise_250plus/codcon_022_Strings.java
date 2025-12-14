package CodingPracticeExercise_250plus;

public class codcon_022_Strings {
    public static void main(String[] args) {

//        Example showing that strings are immutable
        String word = "Kashish";
        System.out.println("Initial word is : " + word);
        String new_word = word.toUpperCase();
        System.out.println("After doing an uppercase function on word, the word still is : " + word);
        System.out.println("But we stored the operated string in a new variable , so that is a different string in String Constant Pool is : " + new_word);
        System.out.println("Basically we called a function on the initial string, but that did not change it. That's why we say that strings are immutable");

//       There are two ways in which strings can be created. As shown below:

        String a = "Cars"; //SCP
        String b = new String("Bikes"); //OA

        String s1 = "cars";
        s1 = s1.concat(" and bikes.");
        System.out.println(s1);

//        Interview Question
        String name = "pramod";
        name = name.toUpperCase();
        System.out.println(name);

//        Proof how string comparison is location reference based
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));


    }
}
