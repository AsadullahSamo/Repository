package ClassPrograms_Lecture_13_to_24;

class MyThread extends Thread {
    public int num;
    public MyThread(int num){
        this.num = num;
    }
        public void run () {
            for (int i = num; i <= 20; i++) {
                System.out.println("Inside MyThread and i is "+i);
                if (i % 2 == 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        System.out.println("Exception occured");
                    }    // end of try catch
                }       // end of if
                else if(i==9){
                    System.out.println("Break executed");
                    break;
                }
                }  // end of for loop
            }     // end of run()
    }       // end of MyThread

public class Lecture_17_HomeWork {
    public static void main(String[] args) {

        Thread m1 = new Thread(new MyThread(0));
        Thread m2 = new Thread(new MyThread(10));
        m1.start();
        m2.start();



    }        // end of main() method
}           // end of program
