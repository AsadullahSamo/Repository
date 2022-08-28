package ClassPrograms;
class Demo{
    byte age;
    String name;
    short roll_no;
    public void setAge(byte age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll_no(short roll_no) {
        this.roll_no = roll_no;
    }

    public byte getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public short getRoll_no() {
        return roll_no;
    }
}
    // start of main
    public class Lecture_05_Question{
        public static void main(String[] args) {
            Demo d1, d2;
            d1 = new Demo();
            d1.setAge((byte)15);
            d1.setName("Asad");
            d1.setRoll_no((short)36);
            d2 = new Demo();
            d2.setAge((byte)27);
            d2.setName("Waseem");
            d2.setRoll_no((short)51);
            System.out.println("First name is "+d1.getName());
            System.out.println(d1.getName()+" has age: "+d1.getAge());
            System.out.println("Your roll number is: "+d1.getRoll_no());
            System.out.println("Name of object 2 is "+d2.getName());
            System.out.println("Your age is: "+d2.getAge());
            System.out.println("Your roll number is: "+d2.getRoll_no());
        }
    }