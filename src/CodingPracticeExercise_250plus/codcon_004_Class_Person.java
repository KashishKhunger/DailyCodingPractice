package CodingPracticeExercise_250plus;

public class codcon_004_Class_Person {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.run();
        P1.years_of_experience = 24;
        P1.has_Dependents = true;
        P1.Salary = 200000;
        int InHandSalary = (int) P1.inHandSalary();
        P1.setAddress("132 , Hudson Lane, Delhi");
        byte N = P1.number_of_Years_without_Job((byte) 44);
        System.out.println(P1.Address);
        System.out.println(InHandSalary);
        System.out.println(N);

    }
}

class Person{
    String Name;
    byte Age;
    String Address;
    String Profession;
    String Company;
    double Salary;
    Boolean is_Married;
    Boolean has_Dependents;
    int number_of_Dependents;
    byte years_of_experience;

    // 1.Without Parameters and Without Return Type
    void run(){
        System.out.println("Person is Running");
    }

    // 2.Without Parameters but With Return Type
    public double inHandSalary() {
        return Salary;
    }

    // 3.With Parameters and Without Return Type

    public void setAddress(String address) {
        Address = address;
    }

    // 4. With Parameters and With Return Type
    byte number_of_Years_without_Job(byte Age ){
        return (byte) (Age-years_of_experience);
    }

}
