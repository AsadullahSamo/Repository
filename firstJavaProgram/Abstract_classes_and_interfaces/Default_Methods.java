package Abstract_classes_and_interfaces;
interface Polygon2{
    void getArea();
    default void getSides(){
        System.out.println("I can get sides of Polygon");
    }
}         // end of class Polygon2

class Rectangle2 implements Polygon2{
    @Override
    public void getSides(){
        System.out.println("I have 4 sides");
    }
    public void getArea(){
        int length = 6, breadth =5;
        int area = length * breadth;
        System.out.println("The area of rectangle is "+area);
    }
}      // end of class Rectangle2

class Square2 implements Polygon2{
    public void getArea(){
        int length = 5;
        int area = length * length;
        System.out.println("The area of square is "+area);
    }
}      // end of class Square2

public class Default_Methods {
    public static void main(String[] args) {

        Rectangle2 r2 = new Rectangle2();
        r2.getSides();
        r2.getArea();

        Square2 s2 = new Square2();
        s2.getSides();
        s2.getArea();

    }   // end of main() method
}      // end of program
