package ClassPrograms;
class Car3{
    String color;
    String car_type;
    byte capacity;
    long engine_no;
    public void changeCarType(Car3 c3){
        c3.car_type = "Van";
    }
}

public class Lecture_07_Question {
    public static void main(String[] args) {
        // Question: Create method changeCarType() in class Car with return type void.
        // This method takes object of class as argument and inside method change type attribute from Car to van
        // and print all attributes
        Car3 car3 = new Car3();
        car3.capacity = 5;
        car3.engine_no = 5789636;
        car3.car_type = "Car";
        car3.color = "Red";

        car3.changeCarType(car3);
        System.out.println(car3.capacity);
        System.out.println(car3.engine_no);
        System.out.println(car3.car_type);
        System.out.println(car3.color);
    }
}
