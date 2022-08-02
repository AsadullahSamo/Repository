package Arrays;

public class for_Each_loop {
    public static void main(String[] args) {

        // Arrays have a length property which gives length of array
        int [] marks = {100, 45, 79, 90, 85};
        System.out.println("Length of array marks is "+marks.length);
        String [] names = {"Asad", "Junaid", "Awais", "Waseem"};
        System.out.println("Name at index [1] is "+names[1]);

        // Displaying an array

        // 1. Using for loop
        System.out.println("Displaying array marks using for loop");
        for(int i=0; i<marks.length; i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        // Quick quiz (Printing marks array in reverse order)
        System.out.println("Displaying array marks in reverse order using for loop");
        for(int i=marks.length-1; i>=0; i--)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        // 2. Using for Each loop
        System.out.println("Displaying array marks using for each loop");
        // Is better to use when we don't require index of particular element otherwise we use for loop
        for(int element: marks)                    // there can be any name instead of element
        {
            System.out.println(element);
        }
        System.out.println("Displaying array names using for each loop");
        for(String name: names)
        {
            System.out.println(name);
        }

    }
}
