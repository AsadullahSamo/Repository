package Packages;

public class Asad{
    public int a = 5;
    protected int b = 10;
    int c = 15;
    private int d = 20;

    public void method(){
            System.out.println("Public a: "+a);
            System.out.println("Protected b: "+b);
            System.out.println("Default c: "+c);
            System.out.println("Private d: "+d);
    }

    public static void main(String[] args){
        System.out.println("I am class Asad's main method!");
        // Packages --> Scanner is class in java.util Package
        //              ArrayList is class in java.util Package
    }     // end of main() method
}        //  end of program