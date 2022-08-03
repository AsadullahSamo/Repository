package Access_Modifiers_and_Constructors;
class Cylinder{
    private int radius;
    private int height;
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
    // no need of set area as we already set height and radius to their values
    public double getArea(){
        return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);   // Math.PI is used to get exact value of PI
    }
    public double getVolume(){
        return (Math.PI*radius*radius*height);
    }

    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    } // end of constructor with two args
}   // end of class cylinder

class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        length = 4;
        breadth = 5;
    }         // end of constructor with no args
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}    // end of class Rectangle

class Sphere{
    private int radius;
    public Sphere(int r){
        radius = r;
    }
    public int getRadius() {
        return radius;
    }
    public double Area(){
        return 4*Math.PI*radius*radius;
    }
    public double Volume(){
        return (4*Math.PI*radius*radius*radius)/3;
    }
}    // end of class Sphere

public class ch_09_Questions {
    public static void main(String[] args) {

        // Question 1: setting radius and height of cylinder using getters and setters
      /*      Cylinder c = new Cylinder();
            c.setRadius(9);
            int r = c.getRadius();
            System.out.println("The radius of cylinder is: "+r);
            c.setHeight(12);
            System.out.println("The height of cylinder is: "+c.getHeight());

        // Question 2: Calculating surface area and height of cylinder   --> V = pi*r*r*h  -->
            System.out.println("The area of cylinder is: "+c.getArea());
            System.out.println("The volume of cylinder is: "+c.getVolume());
        */
        // Question 3: Repeat Q:1 using constructor
            Cylinder c1 = new Cylinder(10, 5);
            System.out.println("The height of cylinder is: "+c1.getHeight());
            System.out.println("The radius of cylinder is: "+c1.getRadius());
            System.out.println("The surface area of cylinder is: "+c1.getArea());
            System.out.println("The volume of cylinder is: "+c1.getVolume());

        // Question 4: Overloading a constructor to initialize a rectangle at length 4 and breadth 5 for using custom parameters
            Rectangle r1 = new Rectangle();
            System.out.println("Length and breadth of initialized constructor rectangle are: "+r1.getLength()+" and "+r1.getBreadth());
            Rectangle r2 = new Rectangle(12,56);
            System.out.println("Length and breadth of parameterized constructor rectangle are: "+r2.getLength()+" and "+r2.getBreadth());
        // Question 5: repeating 1 for sphere
            Sphere s1 = new Sphere(12);
            System.out.println("Area of sphere is: "+s1.Area());
            System.out.println("Volume of sphere is: "+s1.Volume());

    }     // end of main()
}       // end of class
