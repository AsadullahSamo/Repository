package Lab_10_Tasks;

import java.io.File;

public class Read_Write_permission {
    public static void main(String[] args) {

        File file2 = new File("Third.txt");
        file2.setExecutable(false);
        file2.setReadable(false);
//        file2.setWritable(true);

        System.out.println("done...");

    }
}
