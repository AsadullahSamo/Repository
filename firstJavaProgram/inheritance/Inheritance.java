package inheritance;
class Animal{
    // Base class
    protected String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void eat(){
        System.out.println("I can eat!");
    }
}   // end of class Animal

class Lion extends Animal{
    public void display(){
        System.out.print("My name is: "+name);
    }
}    // end of Lion

public class Inheritance {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.setName("King of the Jungle");
        l.eat();
        l.display();
    }
}
