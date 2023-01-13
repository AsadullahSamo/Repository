package Lab_07_Tasks;
class EvenNumbers extends Thread{
    @Override
    public void run(){
        for(int i=2; i<=50; i+=2){
            if(i==30){
                try{
                    Thread.sleep(5000);
                    System.out.println(30);
                }
                catch (InterruptedException ie){
                    System.out.println("Exception occurred");
                }
            }
            else
            {
                System.out.println(i);
            } // end of if else block
        }    // end of for loop
    }       // end of run() method
}          // end of class EvenNumbers

public class Lab_07_Task_01 {
    public static void main(String[] args) {

        EvenNumbers en = new EvenNumbers();
        en.start();

    }    // end of main() method
}       //  end of program
