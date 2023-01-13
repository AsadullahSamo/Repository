package Lab_09_Tasks;
class Mother{
    public void display(){
        System.out.println("This is mother class");
    }
}
class Daughter extends Mother{
    public void greet(){
        System.out.println("Greet");
    }
    @Override
    public void display(){
        System.out.println("This is Daughter class");
    }
}
public class Lab_09_Task_02 {
    public static void main(String[] args) {

        Daughter d= new Daughter();
        d.display();

        Mother m = new Daughter();     // Object of Daughter is created with mother of reference
        m.display();
//        m.greet() --> Not allowed (only those methods can be called which are present in Parent class)
//        Daughter d1 = new Mother();  --> Not allowed

    }
}
