package MultiThreading;
class Mythread extends Thread{
    public Mythread(String name){
        super(name);  // to call super class constructor
    }
    public void run(){
        System.out.println("Thank you " + this.getName());
    }
}       // end of class


public class Constructors_In_Threads {
    public static void main(String[] args) {

        Mythread t1 = new Mythread("Asad");
        t1.start();        // to call constructor
        Mythread t2 = new Mythread("Moiz");
        t2.start();
        System.out.println("The id of this thread is " +t1.getId());
        System.out.println("The id of this thread is " +t2.getId());
        System.out.println("The name of this thread is " +t2.getName());

    }        // end of main() method
}           //  end of program
