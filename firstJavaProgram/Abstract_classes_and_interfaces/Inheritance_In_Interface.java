package Abstract_classes_and_interfaces;
interface Sample{
    void meth1();
    void meth2();
}      // end of interface Sample

interface ChildSample{    // Now if we want that we should have meth1() and meth2() in ChildSample, we may inherit it
    void meth3();
    void meth4();
}      // end of interface ChildSample

class MySampleClass implements ChildSample{
    public void meth1() {              // we must also implement meth1() and meth2() in class
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("meth2");
    }
    public void meth3() {
        System.out.println("meth3");
    }
    public void meth4() {
        System.out.println("meth4");
    }
}

public class Inheritance_In_Interface {
    public static void main(String[] args) {

        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }     // end of main() method
}        //  end of program
