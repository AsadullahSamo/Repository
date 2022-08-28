package MultiThreading;

class thread1 implements Runnable{
    public void run(){
        for(int i=1; i<20; i++){
            System.out.println("I am a thread");
        }
    }
}      // end of class thread
class thread2 implements Runnable{
    public void run(){
        for(int i=1; i<20; i++){
            System.out.println("Java, C++, Python");
        }
    }
}

public class MultiThreading_Using_Runnable_Interface {
    public static void main(String[] args) {

        thread1 bullet1 = new thread1();
        thread2 bullet2 = new thread2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();          // bullet1.start() will give error
        gun2.start();         //  This using of interface is just like gun where we have to put bullet necessarily, otherwise gun is of no work

    }       // end of main() method
}          // end of program
