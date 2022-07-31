package MultiThreading;
class ASAD extends Thread{
    public ASAD(String name){
        super(name);  // to call super class constructor
    }
    public void run(){
        while(true) {
            System.out.println("Thank you " + this.getName());
        }
    }
}       // end of class ASAD


public class Thread_Priorities {
    public static void main(String[] args) {

        // JVM gets Ready queue having all threads ready to run i.e.(T1, T2, T3, T4, T5)
        // Priority means which thread will be running more

        ASAD t1 = new ASAD("Asad");
        ASAD t2 = new ASAD("Moiz");
        ASAD t3 = new ASAD("Awais (most important)");       // let's say its most important thread and we wanna give priority to this and, (its not necessary that it'll run first but it will get execute more times than any other)
        ASAD t4 = new ASAD("Kashan");
        ASAD t5 = new ASAD("Waryal");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }       //  end of main() method
}          //   end of program
