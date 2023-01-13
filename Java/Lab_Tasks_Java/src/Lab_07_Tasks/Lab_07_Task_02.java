package Lab_07_Tasks;

class Storage {
    static int[] storage = new int[11];
}    // end of class Storage
class Counter extends Thread{
    @Override
    public void run(){
        for(int i=0; i<11; i++){
            // Store i value into storage variable of class Storage
            Storage.storage[i] = i;
        }
    }
}        // end of class Counter
class Printer extends Thread{
    @Override
    public void run(){
        for(int i=0; i<11; i++){
            // print storage value
            System.out.println(Storage.storage[i]);
        }
    }
}         // end of class Printer

public class Lab_07_Task_02 {
    public static void main(String[] args) {

          Counter c = new Counter();
          c.start();
          Printer p = new Printer();
          p.start();


    }        // end of main() method
}            //  end of program
