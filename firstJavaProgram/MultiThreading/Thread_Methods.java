package MultiThreading;
class Methods extends Thread{
    public Methods(String name){
        super(name);  // to call super class constructor
    }
    public void run(){
        while(true) {
            System.out.println("Thank you " + this.getName());
        }      // end of while
    }         // end of method run()
}       // end of class Methods

class Methods2 extends Thread{
    public void run(){
        while(true) {
            System.out.println("Thank you " + this.getName());
        }
    }
}



public class Thread_Methods {
    public static void main(String[] args) {

        // if we want that first our t1 will run completely then t2 starts, we can use join method
        Methods t1 = new Methods("Asad");
        Methods t2 = new Methods("Naeem");
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        // see also sleep method() --> this method stops working of thread for a certain time


    }        // end of main() method
}           //  end of program
