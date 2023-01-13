package Lab_10_Tasks;
import org.json.simple.JSONObject;

import java.io.*;
import java.io.IOException;

public class Task_01 {
    public static void main(String[] args) {

        File myFile = new File("first.json");
        // creating the File
        try {
            if (myFile.createNewFile())
                System.out.println("File created "+myFile.getName());
        }
        catch (IOException ie){
            System.out.println("File not found");
            ie.printStackTrace();
        }
        // Writing in the file
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("First_Name", "Asad");
        jsonObject.put("Caste", "Samo");
        jsonObject.put("Age", "18");
        jsonObject.put("Status", "Student");
        try{
            FileWriter file = new FileWriter("first.json");
            file.write(jsonObject.toJSONString());
            file.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // Reading from the file
        try{
            Reader reader = new FileReader("first.json");
            int data = reader.read();
            while(data!=-1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch (IOException ie){
            System.out.println("File can't be read");
            ie.printStackTrace();
        }  // end of try catch block

    }           // end of main() method
}
