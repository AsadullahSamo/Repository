package inheritance;
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param constructor of circle");
    }
    Circle(int radius){
        System.out.println("I am circle parametrized constructor");
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}    // end of class Circle

class Cylinder extends Circle{
    public int height;
    Cylinder(int radius, int height){
      //  super(radius);
        System.out.println("I am cylinder parametrized constructor");
        this.height = height;
    }   // end of Constructor of Cylinder
    public double volume(){
        return Math.PI*radius*radius*height;
    }   // end of method volume
}      // end of class Cylinder

public class Chapter_10_Inheritance_Questions {
    public static void main(String[] args) {
        // Question 01:
        // Circle c = new Circle(12);
        Cylinder cl = new Cylinder(5, 9);

    }    // end of main() method
}       // end of program
