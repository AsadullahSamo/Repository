package Lab_09_Tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task_02 {
    public static void main(String[] args) {
        File file = new File("Connection.json");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
