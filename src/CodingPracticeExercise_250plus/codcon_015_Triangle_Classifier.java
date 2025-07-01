package CodingPracticeExercise_250plus;

public class codcon_015_Triangle_Classifier {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is
        // equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle

        int l1 = Integer.parseInt(args[0]);
        int l2 = Integer.parseInt(args[1]);
        int l3 = Integer.parseInt(args[2]);

        if (l1 == l2 & l2==l3){
            System.out.println(" All sides Equal : It's an EQUILATERAL TRIANGLE");
        } else if (l1 != l2 & l2!=l3 & l1!=l3 ) {
            System.out.println("None of the sides are Equal: It's a SCALANE TRIANGLE ");
        }
        else {
            System.out.println("2 sides Equal : It's an ISOSCELES TRIANGLE");
        }
    }
}
