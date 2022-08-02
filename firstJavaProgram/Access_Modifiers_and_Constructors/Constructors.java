package Access_Modifiers_and_Constructors;

class Employee{
    private int id;
    private String name;

//    public void setName(String n)  { name = n; }
//    public void setId(int ID){ id = ID; }
    public String getName(){ return name; }
    public int getId(){ return id; }
    public Employee(){
        id = 45;
        name = "Your name";
        System.out.println("I will be displaying two times because two objects with no args are created");
    }   // end of constructor with no args
    public Employee(String n){
        name = n;
    }   // end of constructor with one arg
    public Employee(String n, int ID){
        name = n;
        id = ID;
        System.out.println("I will be displaying one time because one object with two args is created");
    }  // end of constructor with two args

}  // end of class Employee

public class Constructors {
    public static void main(String[] args) {
        // Constructor -->
        // 1. A member function used to initialize an object while creating it
        // 2. It has same name as class
        // 3. It does not return anything, and it has no any return type

//        Employee e1 = new Employee();
//        e1.setName("Asad");
        // Rather than these two lines we can use constructor to initialize object while creating it
        Employee e1 = new Employee();       // call to constructor with no arg
        Employee e2 = new Employee();       // call to constructor with no arg
        Employee e3 = new Employee("Junaid");           // call to constructor with one arg
        Employee e4 = new Employee("Sajjad", 78);   // call to constructor with two args


        System.out.println("Employee 1 is "+e1.getName());
        System.out.println("Id of employee 2 is "+e2.getId());
        System.out.println("Name of employee 3 is "+e3.getName());
        System.out.println("Name of employee 4 is "+e4.getName()+" and his id is "+e4.getId());

    }    // end of main() function
}    // end of class