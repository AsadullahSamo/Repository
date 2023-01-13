package Lab_09_Tasks;
import java.util.Scanner;

interface Vehicle{
    public void accelerate(int accelerate);
    public void decelerate(int decelerate);
}
interface Car extends Vehicle{
//    public void accelerate(int accelerate);
//    public void decelerate(int decelerate);
}
interface Bus extends Vehicle{
//    public void accelerate(int accelerate);
//    public void decelerate(int decelerate);
}
interface Truck extends Vehicle{
//    public void accelerate(int accelerate);
//    public void decelerate(int decelerate);
}

class small_Vehicle implements Vehicle{
    int accelerate, decelarate;
    private String color;
    private long engine_no;
    private float weight;

    public void setColor(String color) {
        this.color = color;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setEngine_no(long engine_no) {
        this.engine_no = engine_no;
    }
    public String getColor() {
        return color;
    }
    public float getWeight() {
        return weight;
    }
    public long getEngine_no() {
        return engine_no;
    }

    @Override
    public void accelerate(int accelerate){
        this.accelerate = accelerate;
    }
    @Override
    public void decelerate(int decelarate){
        this.decelarate = decelarate;
    }
}    // end of class Honda

class Honda extends small_Vehicle{

}
class VigoTuck extends small_Vehicle{

}
class SchoolBus extends small_Vehicle{

}

public class Lab_09_Task_01 {
    public static void main(String[] args) {

        Honda h = new Honda();
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value for accelerate: ");
//        int accelerate = sc.nextInt();
//        System.out.print("Enter the value for decelerate: ");
//        int decelerate = sc.nextInt();

        System.out.print("Enter the color of Car: ");
        String color = sc.nextLine();
        h.setColor(color);

        System.out.println("Enter the Car's weight: ");
        float weight = sc.nextFloat();
        h.setWeight(weight);

        System.out.println("Enter the engine no: of Car");
        long engine_no = sc.nextLong();
        h.setEngine_no(engine_no);

        System.out.println("The color of Car is "+h.getColor());
        System.out.println("The weight of Car is "+h.getWeight());
        System.out.println("The engine no of Car is "+h.getEngine_no());

        SchoolBus sb = new SchoolBus();

        System.out.print("Enter color for Bus: ");
        String color2 = sc.next();
        sb.setColor(color2);
        System.out.println("The color of Raja Kamran is "+sb.getColor());

        VigoTuck vt = new VigoTuck();
        float weight2 = sc.nextFloat();
        vt.setWeight(weight2);
        System.out.println("The weight of vigo truck is "+vt.getWeight());
    }    // end of main() method
}        // end of program
