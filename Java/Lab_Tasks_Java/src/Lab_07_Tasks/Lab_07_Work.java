package Lab_07_Tasks;

public class Lab_07_Work extends Thread{
    public static int amount = 0;
    public static void main(String[] args) {
        Lab_07_Work thread = new Lab_07_Work();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: "+amount);
        amount++;
        System.out.println("Main: "+amount);
    }         // end of main() method

    public void run(){
        amount++;
    }           // end of run() method
}              //  end of class Main