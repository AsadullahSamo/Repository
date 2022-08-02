package Abstract_classes_and_interfaces;
abstract class Pen{
    abstract void write();
    abstract void refill();
}    // end of class Pen
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing with Pen...");
    }
    void refill(){
        System.out.println("Refilling ink in Pen...");
    }
    void changeNib(){
        System.out.println("Changing the nib...");
    }
}     // end of class FountainPen

public class Ch_11_Questions {
    public static void main(String[] args) {

       // Question 01: Create abstract class Pen with methods write() and refill()
       // Question 02: Create a concrete class FountainPen from class Pen with addition method changeNib()
        FountainPen pen = new FountainPen();
        pen.changeNib();

    }     // end of main() method
}        //  end of program
