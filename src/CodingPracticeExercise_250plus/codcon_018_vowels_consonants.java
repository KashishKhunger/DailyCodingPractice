package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_018_vowels_consonants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to check for vowels and consonants: ");
        String word = scanner.next();
        word = word.toLowerCase();
        int characters = word.length();
        System.out.println(characters);
        int vowels = 0;
        int consonants = 0;

        for (int i =0 ; i< characters ; i++){
            char ch = word.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' ||ch=='u') vowels++;
                    else consonants++;
        }
        System.out.println("vowels -> " + vowels );
        System.out.println("consonants -> " + consonants );
    }
}
