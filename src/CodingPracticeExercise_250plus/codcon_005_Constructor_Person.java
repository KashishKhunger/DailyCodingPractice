package CodingPracticeExercise_250plus;

public class codcon_005_Constructor_Person {
    public static void main(String[] args) {
        Person1 P1 = new Person1();
        System.out.println(P1.Name);
        System.out.println(P1.Age);
        System.out.println(P1.Address);
        System.out.println(P1.Phone);
        System.out.println(P1.is_Male);

        Person1 P2 = new Person1("Ananya" ,"XYZ");
        P2.printDetails();

        Person1 P3 = new Person1("Rohan", (byte)4 , 47247357);
        P3.printDetails();
    }
}

class Person1{
    String Name;
    byte Age;
    String Address;
    int Phone;
    Boolean is_Male;

    // Default Constructor
    Person1(){
        Name = "Default";
    }
    //Parameterised Constructor
    Person1(String name, byte age,int phone){

        Name = name ;
        Age = age;
        Phone = phone;

    }
    //PC Type 2
    Person1(String name, String add){
        Name = name ;
        Address = add;
    }


    //Behaviours/Functions
    void eat(){
        System.out.println(Name + " eats");
    }
    void sleep(){
        System.out.println(Name + " sleeps");
    }
    void walk(){
        System.out.println(Name + " walks");
    }
    void doHome(){
        System.out.println(Name + " does Homework");
    }
    void printDetails(){
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
        System.out.println("Phone:" + Phone);
        System.out.println("Address:" + Address);
        System.out.println("Gender is Male:" + is_Male);
        walk();
    }



}
