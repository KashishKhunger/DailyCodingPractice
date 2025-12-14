package CodingPracticeExercise_250plus;

import java.util.Scanner;

public class codcon_023_Leap_Year_Checker {
    public static void main(String[] args) {

        System.out.println("Enter the Year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year==0) System.exit(1);

//        ex. 2016 -> is it divisible by 4? It shouldn't be divisible by 100 unless it is divisible by 400
//        2016 is div by 4? - yes.
//        2016 is not div by 100? - yes
//        2016 (if div. by 100 should also be divisible by 400)- ok
//        ex if the year is 2100 -> it's div by 100 but not by 4/400 then it's not a leap year

        boolean result = isLeapYear(year);

        if (result==true)
        System.out.println("It's a leap year");
        else
            System.out.println("It's not a leap year.");


    }


    public static boolean isLeapYear(int year){

        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            return true;
        }
        else
            return false;
    }
}
