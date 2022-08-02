package inheritance;
class Mammal{
    public void display(){
        System.out.println("I am Mammal");
    }
}

class Dolphin extends Mammal{
    @Override
    public void display(){
        super.display();
        System.out.println("I am Dolphin");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Dolphin fish = new Dolphin();
        fish.display();
        Mammal m = new Mammal();
        m.display();

    }
}
