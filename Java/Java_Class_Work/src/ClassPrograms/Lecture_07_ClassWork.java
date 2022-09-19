package ClassPrograms;
class Student{
    byte age;
    String roll_no;
    String name;
    Student(){
        name = "abc";
        roll_no = "21SW";
        age = 0;
    }
    Student(String name, String roll_no, byte age){
        this.name = name;
        this.roll_no = roll_no;
        this.age = age;
    }
    Student(String name, String roll_no){
        this.name = name;
        this.roll_no = roll_no;
        this.name = "Ali";
    }
    Student(Student s){
        name = s.name;
        roll_no = s.roll_no;
        age = s.age;
    }
   public String toString(){
        return name+" "+roll_no+" "+age;
    }
    public Student changeAge(){
        this.age = (byte) (this.age + 5);
        this.name = "Emma";
        return this;
    }
    public String changeName(){
        this.name = "dfe";
        return name;
    }
}

public class Lecture_07_ClassWork {
    public static void main(String[] args) {

        Student s1, s2, s3, s4, s5, s6, s7;
        s1 = new Student();
        s2 = new Student("Asad", "21SW", (byte)17);
        s3 = new Student(s2);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
        s4 = new Student(s3);        // copy object s3 to s4
        s4 = s3.changeAge();         // call changeAge() method to change age by +5 and put all other attributes same
//        System.out.println(s4);     //  print s4
        s5 = new Student("Saad", "19SW");
        System.out.println(s5);      // Even we passed name Saad  but yet it'll print Ali because we changed object name parameter and objects are passed by reference
        s6 = new Student(s3);
        s3.changeName();
        System.out.println(s6);      // print all s3 object value because changeName is called after s6 is set to s3 so its not gonna effect s6
        s7 = new Student(s3);
        s7.changeName();        // if we did here s3.changeName() then name is not going to be changed
        System.out.println(s7);
    }
}
