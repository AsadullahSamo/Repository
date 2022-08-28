package ClassPrograms_Lecture_09_to_12;
import java.util.ArrayList;

class University{
    String uname;
    ArrayList<Students> studentList = new ArrayList<Students>();         // In ArrayList type argument can't be of primitive dataType
    ArrayList<Departments> deptlist = new ArrayList<Departments>();

    University(String uname, String[] dname, String[] sname){   // Constructor with three args (String type, array, array// )
        this.uname = uname;
        for(int i=0; i< dname.length; i++){
            deptlist.add(new Departments(dname[i]));
        }      // end of for loop
        for(int i=0; i< sname.length; i++){
            studentList.add(new Students(sname[i]));
        }      // end of for loop
    }     // end of constructor


    Students getStudents(String sname){
        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).sname.equals(sname)) {
                return studentList.get(i);    // end of if statement
            }
        }      // end of for loop
        return null;
    }

    Departments getDepartment(String dname){
        for(int i=0; i<deptlist.size(); i++){
            if(deptlist.get(i).dname.equals(dname)) {
                 return deptlist.get(i);
            }
        }      // end of for loop
        return null;
    }      // end of method
    class Students{
        String sname;
        Departments sdept;
        Students(String sname){
            this.sname = sname;
        }
        void display(){
            System.out.println("Student name is: "+sname);
            System.out.println("Department name is: "+sdept.dname);
        }     // end of method=
    }    // end of class Students

    class Departments{
        String dname;
        ArrayList<Students> studentsEnroll = new ArrayList<Students>();
        Departments(String dname){
            this.dname = dname;
        }
        void display(){
            System.out.println("Department name is "+dname);
            for(int i=0; i<studentsEnroll.size(); i++)      // we use for loop to access Arraylist of Students
            {
                System.out.println("Student name is "+studentsEnroll.get(i).sname);
            }// end of for loop
        }   //  end of method display
    }      // end of class Departments

        public void enrollsIn(Departments d, Students s){
            s.sdept = d;
            d.studentsEnroll.add(s);
        }  // end of method enrollsIn
        void displayStudents(Departments d){
            d.display();
        }   // end of method displayStudents
        void displayStudents(Students s){
            s.display();
        }   // end of method displayStudents
}     // end of class University


public class Lecture_09_10_ClassWork_ArrayList {
    public static void main(String[] args) {

        String [] sname = {"Ali", "Mohsin", "Ahsan", "Saad", "Asad"};
        String [] depts = {"SW", "CS", "TL"};
        University muet = new University("MUET", depts, sname);

        muet.enrollsIn(muet.getDepartment("SW"), muet.getStudents("Ali"));
        muet.enrollsIn(muet.getDepartment("CS"), muet.getStudents("Mohsin"));
        muet.enrollsIn(muet.getDepartment("CS"), muet.getStudents("Ahsan"));
        muet.enrollsIn(muet.getDepartment("SW"), muet.getStudents("Saad"));
        muet.enrollsIn(muet.getDepartment("SW"), muet.getStudents("Asad"));

        muet.displayStudents(muet.getDepartment("CS"));
        muet.displayStudents(muet.getDepartment("SW"));
        System.out.println();
        muet.displayStudents(muet.getStudents("Saad"));
        muet.displayStudents(muet.getStudents("Mohsin"));

    }       // end of main() method
}          //  end of program
