package Access_Modifiers_and_Constructors;
class MyEmployee{
    private int id;
    private String name;

    public void setName(String n)  { name = n; }
    public void setId(int ID) { id = ID; }
    public String getName() { return name; }
    public int getId() { return id; }
}     // end of class MyEmployee

public class Private_Access_Modifier {
    public static void main(String[] args) {
            MyEmployee e1 = new MyEmployee();
//            e1.id = 5;
//            e1.name = "Asad";
            e1.setName("Asad");
            e1.setId(1);
            System.out.println("Name of employee is: "+e1.getName());
            System.out.println("Id of employee is: "+e1.getId());

    }     // end of main() Method
}      // end of class
