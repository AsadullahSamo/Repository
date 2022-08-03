package MultiThreading;
class Question1 extends Thread{
    @Override
    public void run(){
        while(true)
        System.out.println("Good Morning!");
    }
}
class Question2 extends Thread{
    @Override
    public void run(){
        while(true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println("Welcome!");
        }
    }
}        // end of class Question2

class Question4 extends Thread{
    public void run(){
        System.out.println("I am Question 4");
    }
}

public class Thread_Questions {
    public static void main(String[] args) {

        // Question 01: Write a program to print "Good Morning" and "Welcome" continuously using Threads
        Question1 t1 = new Question1();
        Question2 t2 = new Question2();
        // t1.start();
        // t2.start();

        // Question 02: Add a sleep() in Welcome thread to delay its execution for 200ms
        Question2 s3 = new Question2();

        // Question 03: Demonstrate setPriority() and getPriority() methods of threads
        t1.setPriority(6);
        t2.setPriority(9);       // ByDefault priority is normal 5
        System.out.println(t1.getPriority());    // stop start() method execution to see result
        System.out.println(t2.getPriority());

        // Question 04: How to get state of a thread (we use getState() method for this)
        Question4 q4 = new Question4();
        System.out.println(t2.getState());
        q4.start();
        System.out.println(q4.getState());

        // Question 05: How to get reference of a thread (we use currentThread() method for this)
        System.out.println(Thread.currentThread());
    }      // end of main() method
}         //  end of program
