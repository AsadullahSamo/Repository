package inheritance;
class Base{
    Base(){
        System.out.println("I am base class");
    }
    Base(int x){
        System.out.println("I am an overloaded constructor with value of x: "+x);
    }
}
class Derived extends Base{
    Derived(){
        super(7);   // super to run overloaded constructor rather than empty constructor (if super is not present, then first default constructor of base class is executed then constructor of derived class is executed)
        System.out.println("I am derived class");       // if derived class constructor is not created it will yet execute base class constructor
    }
    Derived(int g){
        System.out.println("The value of g is "+g);
    }
}    // end of inherit and derived class

class Super{
    Super(){
        System.out.println("I am a super class constructor");
    }
    Super(int a){
        System.out.println("I am overloaded constructor of super class with value of a: "+a);
    }
}

class Sub extends Super{
    Sub(){
        System.out.println("I am a sub class constructor");
    }
    Sub(int a, int b){
        super(a);
        System.out.println("I am overloaded constructor of sub class with value of b: "+b);
    }
}

class childOfSub extends Sub{
    childOfSub(){
        System.out.println("I am child of sub class ");
    }
    childOfSub(int a, int b, int c){
        super(a, b);       // calls the constructor from parent class which takes two parameters
        System.out.println("I am child of sub class with value of c: "+c);
    }
}

public class Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Derived d = new Derived();
//        Sub b = new Sub(14, 9);
          childOfSub c = new childOfSub(5, 9, 12);
      //  Derived d = new Derived(5);
    }
}
