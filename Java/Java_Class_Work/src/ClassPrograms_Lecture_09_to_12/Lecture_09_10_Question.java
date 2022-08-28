package ClassPrograms_Lecture_09_to_12;
import java.util.ArrayList;

class University1{
    String uname;
    ArrayList<Students1> studlist = new ArrayList<Students1>();
    ArrayList<Departments1> deptlist = new ArrayList<Departments1>();

    University1(String uname, String [] dname, String [] sname){
        this.uname = uname;
        for(int i=0; i< dname.length; i++) {
            deptlist.add(new Departments1(dname[i]));
        }
        for(int i=0; i< sname.length; i++) {
            studlist.add(new Students1(sname[i]));
        }
    }  // end of constructor university

    Departments1 getDepartments(String dname){
        for(int i=0; i< deptlist.size(); i++){
            if(deptlist.get(i).dname.equals(dname)){
                return deptlist.get(i);
            }
        }
        return null;
    }      // end of method

    Students1 getStudent(String sname){
        for(int i=0; i< studlist.size(); i++){
            if(studlist.get(i).sname.equals(sname)){
                return studlist.get(i);
            }
        }
        return null;
    }  // end of method
    class Departments1{
        String dname;
        ArrayList<Students1> studEnrolls = new ArrayList<Students1>();
        Departments1(String dname){
            this.dname = dname;
        }    // end of constructor Departments1
        void display(){
            System.out.println("Department name is "+dname);
            for(int i=0; i<studEnrolls.size(); i++) {
                System.out.println("Student name is " + studEnrolls.get(i).sname);
            }
        }     // end of method

    }  // end of class Departments1

    class Students1{
        String sname;
        Departments1 d;
        Students1(String sname){
            this.sname = sname;
        }  // end of constructor
        void display(){
            System.out.println("Student name is "+sname);
            System.out.println("Department name is "+d.dname);
        }    // end of method
    }  // end of class Students1
    public void enrollsin(Departments1 d, Students1 s){
        s.d = d;
            d.studEnrolls.add(s);
    }
    void display_Students(Departments1 d){
        d.display();
    }
    void displayDept(Students1 s){
        s.display();
    }

}    // end of class University1



public class Lecture_09_10_Question {
    public static void main(String[] args) {
        String [] sname1 = {"Asad", "Saad", "Hassan", "Waryal", "Abbas"};
        String [] depts1 = {"SW", "CS"};
        University1 muet1 = new University1("MUET", depts1, sname1);

        muet1.enrollsin(muet1.getDepartments("SW"), muet1.getStudent("Asad"));
        muet1.enrollsin(muet1.getDepartments("SW"), muet1.getStudent("Saad"));
        muet1.enrollsin(muet1.getDepartments("CS"), muet1.getStudent("Hassan"));

        //muet1.displayDept(muet1.getStudent("Asad"));
        //muet1.displayDept(muet1.getStudent("Saad"));
        muet1.display_Students(muet1.getDepartments("SW"));


        String [] depts2 = {"SW", "CS", "TL"};
        String [] sname2 = {"Asad", "Saad", "Abbas", "Hassan", "Waryal", "Moiz", "Noman", "Kashan", "Hanzala", "Uzair"};
        University1 NED = new University1("NED", depts2, sname2);
        NED.enrollsin(NED.getDepartments("TL"), NED.getStudent("Noman"));
        NED.enrollsin(NED.getDepartments("SW"), NED.getStudent("Waryal"));

        NED.display_Students(NED.getDepartments("SW"));
        NED.displayDept(NED.getStudent("Noman"));


    }     // end of main() method
}        // end of program
