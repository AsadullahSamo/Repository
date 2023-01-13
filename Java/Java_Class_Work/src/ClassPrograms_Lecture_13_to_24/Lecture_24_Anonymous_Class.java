package ClassPrograms_Lecture_13_to_24;
class Polygon{
    public void display(){
        System.out.println("Calling polygon class");
    }
}
class AnonymousDemo{
    void createClass(){
        Polygon p = new Polygon(){
            @Override
          public void display(){
              System.out.println("Calling Anonymous class Method");
          }     // end of display()
        };     // end of object
        p.display();
    }      // end of createClass method
}         // end of class Anonymous

public class Lecture_24_Anonymous_Class {
    public static void main(String[] args) {

        AnonymousDemo ad = new AnonymousDemo();
        ad.createClass();


    }     // end of main()
}        //  end of program
