package Arrays;

public class Arrays {
    public static void main(String[] args) {

         // There are three ways to write arrays
        // 1.     int [] marks = new int[5];       --> Declaration + Memory Allocation
        /* 2.     int [] marks;  -->           Declaration
                  marks = new int[5];   --> Memory Allocation  */      //  (In these both methods if size, if not given then it'll throw error)
        // 3.    int [] marks = { 100, 70, 80, 71, 98};        -->  Declaration + Initialization (In this method size gives error)

        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
//        marks[4] = 86;
        marks[4] = 78;             // In this way marks[4] = 86 is overwritten by marks[4] = 78
        System.out.println("Marks at index [4] is "+marks[4]);

        int [] ages = {10, 15, 20, 25, 30};
        System.out.print("Age at index [2] is "+ages[2]);
    }
}

