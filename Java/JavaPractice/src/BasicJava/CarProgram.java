package BasicJava;
class Car{
    byte capacity;
    long engine_no;
    String cartype;
    String color;
}

public class CarProgram {
    public static void main(String[] args) {

        Car car1, car2;

        car1 = new Car();
        car1.capacity = 5;
        System.out.println(car1.capacity);

    }           // end of main() method
}              //  end of program