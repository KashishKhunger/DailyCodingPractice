package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_019_Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String new_word = "";
        int characters = word.length();

        for (int i=characters-1; i>=0; i--){
            new_word = new_word + word.charAt(i);
        }
        System.out.println("New Word = " + new_word);
//        check palindrome
        if(word.equalsIgnoreCase(new_word))
            System.out.println("it's a palindrome");
        else
            System.out.println("it's not a palindrome");
    }
}
