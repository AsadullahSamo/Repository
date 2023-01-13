package ClassPrograms_Lecture_13_to_24;
class A extends Thread{
    public void run(){
        System.out.println("Running thread "+Thread.currentThread().getName());
    }
}
public class abc {
    public static void main(String[] args) {

        A a = new A();
        A b = new A();
        A c = new A();
        A d = new A();
        A e = new A();

        System.out.println("Running thread name "+a.getPriority());
        System.out.println("Running thread name "+b.getPriority());
        System.out.println("Running thread name "+c.getPriority());
        System.out.println("Running thread name "+d.getPriority());
        System.out.println("Running thread name "+e.getPriority());

        System.out.println();
        System.out.println();
        System.out.println();

        a.start();   b.start();   c.start();   d. start();    e.start();
    }
}
