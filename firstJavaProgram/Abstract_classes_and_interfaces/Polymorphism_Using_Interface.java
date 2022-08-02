package Abstract_classes_and_interfaces;
class CellPhone{
    void pickCall(){
        System.out.println("Connecting...");
    }
    void calling(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
}     // end of class CellPhone

interface Wifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}     // end of interface Wifi

interface Camera{
    void recordVideo();
    void takeSnap();
}      // end of interface Camera

class SmartPhone extends CellPhone implements Wifi, Camera{
    public void recordVideo() {
        System.out.println("Recording Video...");
    }
    public void takeSnap() {
        System.out.println("Taking snap");
    }
    public String[] getNetwork() {
        String [] networkList = {"Iphone", "Vivo", "Realme"};
        for(String item: networkList){
            System.out.println(item);
        }
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }
}        // end of class SmartPhone

public class Polymorphism_Using_Interface {
    public static void main(String[] args) {

        /*
       A. We can achieve polymorphism in Java using the following ways:
       1. Method Overriding
       2. Method Overloading
       3. Operator Overloading
       See programiz website for all these examples
        */

        Camera c = new SmartPhone();     // This is SmartPhone but, use it as Camera (only those methods allowed which are present in Camera) even SmartPhone methods not allowed too
        // sp.getNetwork();  -->  Not allowed
        c.recordVideo();

    }   // end of main() method
}      // end of program
