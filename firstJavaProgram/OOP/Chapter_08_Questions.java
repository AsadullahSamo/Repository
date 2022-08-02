package OOP;
class Employee{
    private
        int salary;
        String name;
    public
        void setSalary(int s){
            salary = s;
        }
        void setName(String n){
            name = n;
        }
        int getSalary(){
            return salary;
        }
        String getName(){
            return name;
        }
}  // end of Employee class
class CellPhone{
    public
        void ringing(){
            System.out.println("Ringing...");
        }
        void vibrating(){
            System.out.println("Vibrating...");
        }
        void callFriend(){
            System.out.println("Calling Noman...");
        }

}    // end of CellPhone class
class Square{
    private
        int side;
    public
        void setSide(int s){
            side = s;
        }
        int getArea(){
            return side * side;
        }
        int getPerimeter(){
            return 4*side;
        }
}    // end of Square class
class Rectangle {
    private
        int length, width;
    public
        void setSide(int l, int w){
            length = l;
            width = w;
        }
        int Area(){
            return length * width;
        }
        int Perimeter(){
            return 2*(length + width);
        }
}    // end of class Rectangle

class Tommy{
    public
        void run(){
        System.out.println("Running from the enemy");
        }
        void fire(){
            System.out.println("Firing on the enemy");
        }
        void hit(){
            System.out.println("Hitting the enemy");
        }
}      // end of class Tommy

class Circle{
    private
        double radius;
    public
        void setRadius(double r){
            radius = r;
        }
        double CircleArea(){
            return 3.14 * radius * radius;
        }
        double CircPeri(){
            return 2*3.14*radius;
        }
}    // end of class Circle

public class Chapter_08_Questions {
    public static void main(String[] args) {
        // Question 1: Creating class with following properties
            Employee e1 = new Employee();
            e1.setName("ABC");
            e1.setSalary(50000);
            System.out.println("Question 1: ");
            System.out.println("Employee name is "+e1.getName());
            System.out.println(e1.getName()+" has salary "+e1.getSalary());

        // Question 2: Creating class cellphone with methods "ringing" and "vibrating"
            System.out.println("Question 2: ");
            CellPhone c1 = new CellPhone();
            c1.callFriend();
            c1.vibrating();
            c1.ringing();

       // Question 3: Creating class square with a method to initialize its side, calculating area and perimeter
            System.out.println("Question 3: ");
            Square sq = new Square();
            sq.setSide(6);
            System.out.println("Area of box is: "+sq.getArea());
            System.out.println("Perimeter of box is: "+sq.getPerimeter());
        // Question 4: Creating class Rectangle with a method to initialize its side, calculating area and perimeter
            System.out.println("Question 4: ");
            Rectangle rc = new Rectangle();
            rc.setSide(6, 5);
            System.out.println("Area of rectangle is: "+rc.Area());
            System.out.println("Perimeter of rectangle is: "+rc.Perimeter());
        // Question 5: Creating class Tommy having methods firing, hitting, abd running
            System.out.println("Question 5: ");
            Tommy player1 = new Tommy();
            player1.run();
            player1.fire();
            player1.hit();
        // Question 6: Creating class Circle with a method to initialize its side, calculating area and perimeter
            System.out.println("Question 6:");
            Circle c = new Circle();
            c.setRadius(7);
            System.out.println("Area of circle is: "+c.CircleArea());
            System.out.println("Perimeter of circle is: "+c.CircPeri());

    }    // end of main() function
}     // end of class
