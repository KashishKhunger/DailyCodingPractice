package CodingPracticeExercise_250plus;

public class codcon_027_Encapsulation {

    public static void main(String[] args) {


//     ATBStudents Student1 = new ATBStudents("kashish" , 27 , 05);
//     ATBStudents Student2 = new ATBStudents("Pearl" , 27 , 06);
//     ATBStudents Student3 = new ATBStudents("Jagrit" , 27 , 07);
//
//     ATBStudents[] Students = new ATBStudents[3];
//     Students[0] = Student1;
//     Students[1] = Student2;
//     Students[2] = Student3;
//
//     for (ATBStudents atbStudents: Students){
//        atbStudents.toString();
//    }

    }

    class ATB {
        private int strength;
        private String full_Name;
        private double total_fees_earned;

        public ATB() {
        }

        public ATB(int strength, String full_Name, double total_fees_earned) {
            this.strength = strength;
            this.full_Name = full_Name;
            this.total_fees_earned = total_fees_earned;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public String getFull_Name() {
            return full_Name;
        }

        public void setFull_Name(String full_Name) {
            this.full_Name = full_Name;
        }

        public double getTotal_fees_earned() {
            return total_fees_earned;
        }

        public void setTotal_fees_earned(double total_fees_earned) {
            this.total_fees_earned = total_fees_earned;
        }


    }
}

//class ATBStudents extends ATB {
//
//     String name;
//     int age;
//     int RollNo;
//
//    ATBStudents(String name, int age, int RollNo) {
//        name = this.name;
//        age = this.age;
//        RollNo = this.RollNo;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int getRollNo() {
//        return RollNo;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{name='" + name + "', age=" + age + "}";
//    }
//
// }
//}