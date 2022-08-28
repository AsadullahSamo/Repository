package Abstract_classes_and_interfaces;
abstract class Base{
    public Base(){
        System.out.println("I am constructor of Base");
    }
    public void sayGood(){
        System.out.println("good...");
    }      // This is regular method
    public abstract void greet();                             // This is abstract method and its body is replaced by ;
}    // end of class Base

class Derived extends Base{
    @Override
    public void greet(){
        System.out.println("Good Morning");       // it overrides greet method of abstract class Base
    }
}     // end of class Derived

class child2 extends Derived{
    public void greet(){
        System.out.println("Good afternoon");
    }
}

public class abstractClass_andMethods {
    public static void main(String[] args) {
        /*
         Abstract --> Existing thought that don't exist in real
         concrete--> when that thing is real

        1.  Abstract Method--> A method that is declared without any implementation (having no definition) and (it is made in class) using keyword abstract
        2.  Abstract Class--> Class having abstract method
        3.  Subclasses override that abstract method in different ways in accordingly their need
        4.  Abstract class can have both regular and abstract methods
        5.  This abstract method maybe used as standard for later methods in child classes
        6.  If a class contains an abstract method, then the class should be declared abstract. Otherwise, it will generate an error.
        7.  When we have declared an abstract method in parent class we have first to implement it in every child class
        8.  Object of abstract class can't be created because its not class in actual it is just a standard to make other classes
        9.  But abstract class can be used as reference
        10. We can access the constructor of an abstract class from the subclass using the super keyword.
         */
            // child2 c2 = new child2(); --> Not allowed, abstract class can't be instantiated (object can't be created)
            Derived d = new Derived();
            d.greet();
            child2 c2 = new child2();
            c2.greet();
            Base b = new Derived();       // Creating reference of abstract class

    }     // end of main() method
}        // end of program
