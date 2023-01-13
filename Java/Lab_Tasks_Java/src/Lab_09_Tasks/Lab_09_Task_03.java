package Lab_09_Tasks;
class Parent{
    public Parent(int n, char s) {
        for(int i=1; i<=n; i++){
            System.out.print(s+" ");
        }
        System.out.println();
    }  // end of constructor
    private int length, width;
    public void setValues(int length, int width){
        this.length = length;     // Put private length attribute of this method equal to value of length that is passed to this method as parameter
        this.width = width;       // Put private width attribute of this method equal to value of width that is passed to this method as parameter
    }
    public float getValues(){
        return length*width;
    }
    public void display(){
        System.out.println("I will be called before child constructor");
    }
    public void demonstrate(){
        System.out.println("I am called by the object of child class");
    }
}     // end of class Parent
class Child extends Parent{
    Child(){
        super(7, '*');      // calls the Constructor of Parent class
        super.display();         // calls the method of parent class
        }
}
// Demonstrating final keyword
final class Super{
    public void show(){
        System.out.println("My class will not be inherited");
    }
}
//class Sub extends Super{       // This will give error (Cannot inherit from final class Super)
//
//}
interface Polygon{
    public void area(int l, int b);
}
class Rectangle implements Polygon{
    @Override
    public void area(int l, int b){
        System.out.println("The area of rectangle is "+l*b);
    }
}

public class Lab_09_Task_03 {
    public static void main(String[] args) {

        // Demonstrating the use of super keyword
        Child ch = new Child();

        // Demonstrating the use of this keyword
        ch.setValues(8, 9);
        System.out.println("The area of rectangle is "+ch.getValues());

        // Demonstrating final keyword
        Super sp = new Super();
        sp.show();
        final int a = 5;
        System.out.println("The value of a is "+a);
        // a = 9;   --> throws error (can't assign a value to final variable)
        // 3rd use of final is final method can be overridden by child class

        // Demonstrating the use of extends
        ch.demonstrate();    // We accessed the method of Parent class using the object of child class

        // Demonstrating the use of implements
        Rectangle r = new Rectangle();
        r.area(7, 9);       // Now rectangle implement the polygon method according to his need

    }     // end of main() method
}        //  end of program
