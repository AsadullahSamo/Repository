package ClassPrograms_Lecture_13_to_24;

class MyThread1 extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Inside class MyThread1 and i is "+i);
            if(i%2==0){
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException ie){
                    System.out.println("Exception occured");
                } // end of try catch block
            } // end of if block
        }    // end of for loop
    }       // end of method run()
}     // end of class MyThread

public class Lecture_17 {
    public static void main(String[] args) {

        Thread mt1 = new Thread(new MyThread1());
        Thread mt2 = new Thread(new MyThread1());
        mt1.start();
        mt2.start();
        System.out.println("Exiting main Thread");

    }      // end of main() method
}         //  end of program
