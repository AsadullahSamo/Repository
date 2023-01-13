package Lab_10_Tasks;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Task_02 {
    public static void main(String[] args) {

        // Creating a file
        File file = new File("Second.txt");
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
        }
        catch (IOException ie){
            ie.printStackTrace();
        }    // end of try catch block

        // Writing in the Second.txt
        try {
            FileWriter fw = new FileWriter("Second.txt");
            BufferedWriter Write = new BufferedWriter(fw);
            Write.write("Second.txt is written by bufferedWriter");
            Write.close();
        }
        catch (IOException ie){
           ie.printStackTrace();
        }

        // Reading from the Second.txt
        try{
            FileReader f = new FileReader("Second.txt");
            BufferedReader br = new BufferedReader(f);
            System.out.println(br.readLine());
        }
        catch (IOException ie){
            ie.printStackTrace();
        }

    }     // end of main() method
}        //  end of program
