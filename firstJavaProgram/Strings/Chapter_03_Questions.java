package Strings;

public class Chapter_03_Questions {
    public static void main(String[] args) {

        // Question 1: (Converting a string to lowercase)
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Question 2: (Replacing spaces to underscores)
        String text = "Java is a programming language";
        text = text.replace(' ','_');
        System.out.println(text);

        // Question 3: (Replacing <name> in text)
        String letter = "Dear <|name|>, Thanks a lot";
        String myName = "Asad";
        letter = letter.replace("<|name|>", myName);
        System.out.println(letter);

        // Questions 4: (Detecting double and triple spaces)
        String detect = "This text contains    double and triple  spaces";
        System.out.println(detect.indexOf("  "));     // if output is -1 means no double spaces are in detect
        System.out.println(detect.indexOf("   "));   // if output is -1 means no triple spaces are in detect

        // Question 5: (Formatting letter)
        // String str = "Dear Harry, This Java course is nice. Thanks"; --> formatting this string
        System.out.println("Dear Harry,\n\tThis Java course is nice.\nThanks");
    }
}
