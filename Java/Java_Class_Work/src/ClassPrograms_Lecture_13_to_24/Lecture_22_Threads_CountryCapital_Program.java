package ClassPrograms_Lecture_13_to_24;
class CountryCapital{
    public synchronized void display(){
        System.out.println("The capital of Pakistan is ");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException ie){
            System.out.println("Exception occurred");
        }
        System.out.println("Islamabad");
        System.out.println("The capital of Iran is ");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException ie){
            System.out.println("Exception occurred");
        }
        System.out.println("Tehran");
    }
}      // end of class CountryCapital
class Thread1 extends Thread {
    CountryCapital cc;
    public void setValue(CountryCapital cc) {
        this.cc = cc;
    }
    public void run(){
        cc.display();
    }
}     // end of class Thread1

public class Lecture_22_Threads_CountryCapital_Program {
    public static void main(String[] args) {

        Thread1 mt1 = new Thread1();
        Thread1 mt2 = new Thread1();
        CountryCapital cobj = new CountryCapital();
        mt1.setValue(cobj);
        mt2.setValue(cobj);
        mt1.start();
        mt2.start();
    }        // end of main() method
}           //  end of program
