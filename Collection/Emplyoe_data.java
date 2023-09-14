package Fxtrading;

import java.util.*;
public class Emplyoe_data {


    private String Emplyoe_name;
    private int EMployee_Id;
    private String Salary;

    public String getEmplyoe_name() {
        return Emplyoe_name;
    }

    public void setEmplyoe_name(String emplyoe_name) {
        Emplyoe_name = emplyoe_name;
    }

    public int getEMployee_Id() {
        return EMployee_Id;
    }

    public void setEMployee_Id(int EMployee_Id) {
        this.EMployee_Id = EMployee_Id;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public Emplyoe_data(String emplyoe_name, int EMployee_Id, String salary) {
        Emplyoe_name = emplyoe_name;
        this.EMployee_Id = EMployee_Id;
        Salary = salary;
    }


    public static void main(String[] args) {
            List<Emplyoe_data> employee = new ArrayList<>();
            Map<Integer, Emplyoe_data> employeeMap = new HashMap<>();
            Scanner sc = new Scanner(System.in);


        //    TreeSet<Emplyoe_data> employee = new TreeSet<>();
//    employee.add("sindh");
//    employee.add("sindh");
        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee Details");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter name");
                    String a = sc.next();
                    System.out.println("enter id");
                    int b = sc.nextInt();
                    System.out.println("enter sal");
                    String c = sc.next();
                    Emplyoe_data   emplyoee1 = new Emplyoe_data(a, b, c);
                    employee.add(emplyoee1);
                    employeeMap.put(b, emplyoee1);
                    System.out.println("successfully added");
                    break;

                case 2:
                    for (Emplyoe_data ab : employee
                    ) {
                        System.out.println(ab);

                    }
                    break;
                case 3:
                    System.out.print("Enter employee ID to search: ");
                    int searchId = sc.nextInt();
//                    Emplyoe_data employeess = employee.get(searchId);
                    Emplyoe_data foundEmployee = employeeMap.get(searchId);
                    if (foundEmployee != null) {
                        System.out.println("Employee found: " + foundEmployee);
                    } else {
                        System.out.println("Employee not found with ID: " + searchId);
                    }
                    break;


                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");


            }
            }


    }

//    TreeSet<Emplyoe_data> employee = new TreeSet<>();
//    employee.add("sindh");
//    employee.add("sindh");
//



}
