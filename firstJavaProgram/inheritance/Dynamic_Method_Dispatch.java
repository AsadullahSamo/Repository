package inheritance;
class Phone{
    public void greet(){
        System.out.println("Assalamualaiakum");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}    // end of Phone

class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}      // end of class SmartPhone and inheritance

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone ph = new SmartPhone();      // allowed (object of SmartPhone is created with reference of Phone)
      //  SmartPhone sph = new Phone();   // not allowed (because object of super class can't be created with reference of subClass)
        ph.greet();     // calls greet method of class Phone
        ph.on();     // calls on method of class SmartPhone because object of SmartPhone is created (not object of phone is created)
        ph.greet();    // allowed
        // ph.name();    not allowed (only those methods can be called which are present in super class in Dynamic Method Dispatch)

    }
}
