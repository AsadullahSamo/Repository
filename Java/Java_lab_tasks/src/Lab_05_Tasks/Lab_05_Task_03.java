package Lab_05_Tasks;

class Student{
    public int age;
    public String name;
    public float height;
    Student(int age, String name, float height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public void initialize(int a, String n, float h){
        age = a;
        name = n;
        height = h;
    }
    public void display(){
        System.out.println("Student name is "+name);
        System.out.println("Student age is "+age);
        System.out.println("Student height is "+height);
    }
}      // end of class Student

public class Lab_05_Task_03 {
    public static void main(String[] args) {

        Student s1 = new Student(18, "Asad", 6);
        s1.display();
        s1.initialize(27, "Junaid", 6.36f);
        s1.display();

    }       // end of main() method
}          //  end of program
