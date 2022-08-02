package inheritance;

    // Java final method
class FinalDemo{
    public final void display(){
        System.out.println("I am parent class");
    }
}

class override extends FinalDemo{
//    public void display(){       --> this will throw error
//      System.out.println("I can not override final method");
//    }
}
    // Java final class
final class Final{
    public void display(){
        System.out.println("No class can be inherited from me");
    }
}

/* class Two extends Final{
        System.out.println("Illegal inheritance from final class");
} */

public class final_keyword {
    public static void main(String[] args) {
        // keyword final is used to make a datatype constant
        // final class can't be inherited and final method can't be overridden

        // 1. Java final variable --> final variable value can't be changed
        final int AGE = 45;
       // AGE = 32;       --> it'll throw error
        System.out.println(AGE);

    }
}
