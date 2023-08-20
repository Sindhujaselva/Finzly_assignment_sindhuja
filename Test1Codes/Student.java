public class Student {
    int studentIID;
    String name;
    static int totalstudents =0;

    Student(){
        this.studentIID = studentIID;
        this.name = name;
        this.totalstudents = totalstudents;
    }
    public void enroll(String name){
        this.name =name;
        System.out.println("new name is:"+name);
        totalstudents++;


    }
    public void   dropoff( int studentIID){
        if (studentIID > 0 && studentIID <= totalstudents) {
            totalstudents = totalstudents - studentIID;

            System.out.println("Dropped student: " + studentIID);
//            totalstudents = totalstudents - dropoff(studentIID);
        }
        else {
            System.out.println("Invalid student ID.");
//            totalstudents -= dropoff(studentIID);
        }


    }

}
class StudentManagementSystem {
    public static void main(String[] args) {
        Student s = new Student();
        s.enroll("Alice");
        s.enroll("Bob");
        s.enroll("Charlie");

        System.out.println("Total students: " + s.totalstudents);

        s.dropoff(2);

        System.out.println("Total students after dropping: " + s.totalstudents);
    }
}
//In this example, the Student class contains instance variables studentId and name, as well as a static variable totalStudents to keep track of the number of students. The enrollStudent() method adds a new student, increments the totalStudents count, and displays the enrollment information. The dropStudent() method allows dropping a student by their ID and updates the totalStudents count accordingly. The main method in StudentManagementSystem demonstrates the usage of the Student class methods to enroll and drop students.





