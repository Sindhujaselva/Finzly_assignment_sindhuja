import java.util.*;
public class MainForRetest {
    public static void main(String[] args) {
//        Shape[] sh = new Shape[3];
//
//        sh[0] = new Circle(5);
//        sh[1] = new Rectangle(4, 6);
//        sh[2] = new Triangle(7, 8);
//
//        for (Shape shape : sh) {
//            System.out.println("Area: " + shape.calculateArea());
//            System.out.println("Perimeter: " + shape.calculatePerimeter());
//            System.out.println();
//        }
//  this for shape program

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String a = sc.nextLine();
        int b = sc.nextInt();

        System.out.println("\nUnknown Student Details:");
        Student unknown = new Student(a,b);
        System.out.println("\nUnknown Student Details:");

//        System.out.println("Name: " + unknown.age);


        Student namedStudent = new Student(a,b);
        System.out.println("\nNamed Student Details:");
        System.out.println("Name: " + namedStudent.name);
        System.out.println("Age: " + namedStudent.age);
        System.out.println("Student ID: " + namedStudent.studentIID);

        sc.close();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Employee Management System");
//        System.out.println("--------------------------");
//
//        // Create a Manager
//        System.out.print("Enter manager's name: ");
//        String managerName = scanner.nextLine();
//
//        System.out.print("Enter manager's id: ");
//        int managerId = scanner.nextInt();
//        scanner.nextLine(); // Consume the newline character
//
//        System.out.print("Enter manager's department: ");
//        String department = scanner.nextLine();
//
//        Manager manager = new Manager(managerId, managerName, department);
//
//        // Create a Developer
//        System.out.print("\nEnter developer's name: ");
//        String developerName = scanner.nextLine();
//
//        System.out.print("Enter developer's id: ");
//        int developerId = scanner.nextInt();
//        scanner.nextLine(); // Consume the newline character
//
//        System.out.print("Enter developer's programming language: ");
//        String programmingLanguage = scanner.nextLine();
//
//        Developer developer = new Developer(developerId, developerName, programmingLanguage);
//
//        // Display employee details
//        System.out.println("\nEmployee Details:");
//        System.out.println("Manager:");
//        System.out.println("Name: " + manager.getName());
//        System.out.println("ID: " + manager.getId());
//        System.out.println("Department: " + manager.getDepartment());
//
//        System.out.println("\nDeveloper:");
//        System.out.println("Name: " + developer.getName());
//        System.out.println("ID: " + developer.getId());
//        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
//
//        scanner.close();


    }
}
