package inheritance;

class Base2{
    private int a;
    Base2(){
        System.out.println("I am no arg constructor");
    }
    Base2(int a){
        this.a = a;
        System.out.println("I am parent class");
    }
    public int getA() {
        return a;
    }
}

class Child extends Base2{
    Child(int c){
        super();
        System.out.println("I am one arg constructor");
    }
}   // end of inheritance and child class

class Animals{
    protected String type = "Animal";
    public void display(){
        System.out.println("I am an animal");
    }
}

class Lion2 extends Animals{
    protected String type = "King";
    @Override
    public void display(){
        System.out.println("I am a Lion");
    }
    public void printMessage(){
      //  display();        // this will call overriding method
        super.display(); // this will call overridden method
    }
    public void printType(){
        System.out.println("I am type "+type);
        System.out.println("I am type "+super.type);
    }
}   // end of class Lion2 and inheritance

class ThisExample{
    public int x, y;
    ThisExample(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("Before passing this to add() method x= "+this.x+" and y= "+this.y);
        add(this);
        System.out.println("After passing this to add() method x= "+this.x+" and y= "+this.y);
    }
    // passing object as an argument
    void add(ThisExample o){
        o.x +=2;
        o.y +=2;
    }
}

public class this_and_super_keyword {
    public static void main(String[] args) {
        System.out.println("super keyword example......");
        Base2 b = new Base2(5);
        System.out.println("The value of a is: "+b.getA());
        Child c = new Child(7);

        // Overriding method --> When child and parent class have same method then child class overrides parent class method
        // The super keyword in Java is used in subclasses to access superclass members (attributes, constructors and methods).
        // super() is a special form of super and can be used only inside the subclass constructor and must be the first statement.

            // 2. Super keyword is also used To call overridden method of superClass
            Lion2 l = new Lion2();
            l.printMessage();

            // 3. to access superclass attributes
            l.printType();

            // Use of this keyword as an argument
            System.out.println("\nthis keyword example......");
            ThisExample t = new ThisExample(5, 9);

    }  // end of main() method
}     //  end of program
