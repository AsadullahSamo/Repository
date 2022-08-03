package OOP;
 class Birds{
    private String name;
    private int wings;

    public void setName(String n){
            name = n;
        }
     public void setWings(int w){
            wings = w;
        }

     public String getName(){
            return name;
        }
     public int getWings(){
            return wings;
        }
//        void printDetails(){
//        System.out.println(name+" has "+wings+" wings");
//        }
}
public class Introduction_to_OOP {
    public static void main(String[] args) {
        // One Java file has only one public class
            Birds bird1 = new Birds();     // Instantiating a new Birds object
            Birds bird2 = new Birds();
            bird1.setName("Pigeon");
            bird1.setWings(5);
            bird2.setName("Sparrow");
            bird2.setWings(3);

            System.out.println("Bird 1: "+bird1.getName());
            System.out.println("Bird 1: "+bird2.getName());
            System.out.println(bird1.getName()+" has "+bird1.getWings()+" wings");
            System.out.println(bird2.getName()+" has "+bird2.getWings()+" wings");
//            bird1.name = "Pigeon";
//            bird1.wings= 5;
//            bird1.printDetails();

    }
}
