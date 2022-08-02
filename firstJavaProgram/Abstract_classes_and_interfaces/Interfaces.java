package Abstract_classes_and_interfaces;
interface Language{
     void getType();
     void getVersion();
}    // end of interface Language

interface Polygon{
    int a = 45;
    void getArea(int length, int width);
}
class Rectangle implements Polygon{       // implement keyword to implement methods
    @Override
    public void getArea(int length, int width) {
        System.out.println("Area of rectangle is: "+length*width);
    }
}    // end of class Rectangle

// 9. In Java, a class can also implement multiple interfaces. For example,
interface A{

}
interface B{

}
class C implements A, B{

}  // end of interface C

// 10. An interface can extend multiple interfaces. For example,

interface a {

}
interface b {

}

interface c extends a, b {

}   // end of interface c

public class Interfaces {
    public static void main(String[] args) {

        /* 1. Interfaces in English is a point where two systems meet and interact
           2. An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
           3. Interfaces can't have regular methods
           4. In Java, Interface is a group of related methods with empty bodies
           5. Interface can't be instantiated(object of interface can't be created) but can be used as reference
           6. To use an interface, other classes must implement it. We use implements keyword to implement an interface.
           7. When implementing interface methods, make all methods implementation public
           8. Using abstract keyword with methods and final keyword with attributes of interface is redundant
        */

        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
        // r1.a = 75;        --> Error! can't assign value to final variable

    }     // end of main() method
}        // end of program
