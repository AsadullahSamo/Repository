package ClassPrograms;
class University{
    String uniName = "MUET";

    static class Student{
        static void display(){    // this is method of class Student
            // To used non-static attribute (uniName) in static method we create object of class University (otherwise it'll throw error)
            University u1 = new University();
            String temp = u1.uniName;
            System.out.println("Displaying University in inner class");
            System.out.println("University is: "+temp);
        }
    }  // end of Inner class Student

    public void outerDisplay(){      // this is method of class University
        System.out.println("Displaying outer method");
        Student.display();
    }
} // end of outer class University

public class Lecture_08_ClassWork {
    // Variable arguments
    /* public static void display(String...a){
        for(int i=0; i<a.length; i++)
            System.out.println(a[i]);
    }    // end of display() method
    */
    public static void display(String cont, String...a){
        System.out.println(cont);
        for(int i=0; i<a.length; i++)
            System.out.println(a[i]);
    }    // end of overloaded display() method
    // While overloading var args, var args must be at last in parameters list

    public static void main(String[] args) {
        // Variable Arguments
        display("America", "Mexico", "Canada", "Pakistan");

        // Composition --> It is strong relation
        // Composition using nested classes
        University myUni = new University();
        myUni.outerDisplay();
       // myUni.display();     --> This will throw error because it is method of class Student
        University.Student s1 = new University.Student();
        University.Student.display();       // same as s1.display()

//        s1.outerDisplay();    --> This will throw error_because it is method of class University


    }    // end of main() method
}
