package Lab_05_Tasks;

class Employee{
    private String name;
    private int age;
    static float height = 9.8f;
    Employee(){
        System.out.println(" Hi, I am constructor. I will be called automatically");
    }
    // Demonstrating mutators and accessors
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
}      // end of class Employee
public class Lab_05_Task_02 {
    public static void main(String[] args) {

        // Constructors example
        Employee e1 = new Employee();
        // mutators and accessors
        e1.setName("Asad");
        e1.setAge(17);
        System.out.println("Employee name is "+e1.getName());
        System.out.println("Employee age is "+e1.getAge());

        // Demonstrating static class members
        System.out.println("Student height is "+ Employee.height);

    }        // end of main() method
}           //  end of program
