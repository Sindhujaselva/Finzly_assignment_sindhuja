public class Employee {
    private String name;
    private int  id;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    public void setName( String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }
    public void setId( int id){
        this.id = id;

    }

    public int getId() {
        return id;
    }
}

class Manager extends Employee{
    private String  department;
    Manager(int name, String age, String department){
        super(age, name);
        this.department = department;

    }
    public void setDepartment( String department){
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

}
class  Developer extends Employee{
    private String programmingLanguage;
    Developer(int name, String age, String department){
        super(age, name);
        this.programmingLanguage = programmingLanguage;
    }
    public void setProgrammingLanguage( String programmingLanguage){
        this.programmingLanguage = programmingLanguage;

    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

}