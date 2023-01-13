package Lab_10_Tasks;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

        File file = new File("Third.txt");

        file.setExecutable(true);
        file.setReadable(false);
        file.setWritable(true);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        int roll_no = sc.nextInt();

        try{
            Writer writer = new FileWriter("Third.txt");
            writer.write(name+"\n"+roll_no);
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try{
            Reader reader = new FileReader("Third.txt");
            int data = reader.read();
            while (data!= -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
