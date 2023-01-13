package Strings;

public class String_Methods {
    public static void main(String[] args) {

        String str = "Time is a great ocean, which, like" +
                     " the other ocean\noverflows with our remains." +
                     " We can not weep over everything.\n" +
                     "Every man has his own sorrows, every century its own pity, and this is enough";
        String str2 = "This is quotation of La Martine";
        System.out.println(str);
        System.out.println(str.charAt(10));
        System.out.println(str.indexOf("e", 15));
        System.out.println(str.equals(str2));
        System.out.println(str.replace('s', '%'));
        System.out.println(str.substring(16, 28));

        int n = 10;
        String s3 = String.valueOf(n);
        System.out.println("String value: "+s3);
        boolean b = false;
        System.out.println("String value: "+String.valueOf(b));
        float f = 3.14f;
        System.out.println("String value: "+String.valueOf(f));

        String s2 = "true";
        boolean b1 = Boolean.valueOf(s2);
        System.out.println("Float Value "+b1);
    }
}
