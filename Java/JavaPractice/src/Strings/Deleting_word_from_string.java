package Strings;
import java.util.Scanner;

public class Deleting_word_from_string {
    public static void main(String[] args) {

        String line, word, newLine;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        line = sc.nextLine();
        System.out.print("Enter word to delete: ");
        word = sc.nextLine();
        newLine = line.replaceAll(word, "");
        System.out.println("After removing "+word+" the line is ");
        System.out.println(newLine);

    }
}
