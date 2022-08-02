package MultiThreading;

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My Thread is running");
            System.out.println("I am happy");
        }  // end of while loop
    }    // end of function run()
}     // end of class
class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread 2 is good");
            System.out.println("I am Asad");
        }  // end of while loop
    }    // end of function run()
}     // end of class

public class Multithreading_by_extending_Thread_class {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();       // It is method to which internally calls run method (when we run this program we'll see that both methods will be running, even though we have infinite loop which never ends in first method)
        t2.start();

    }       // end of main() method
}          //  end of program
