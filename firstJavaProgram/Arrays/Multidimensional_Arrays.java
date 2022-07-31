package Arrays;

public class Multidimensional_Arrays {
    public static void main(String[] args) {

        int [][] flats = new int[2][3];      //  --> A 2-D Array of 2 rows + 3 columns
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;

        System.out.println("Number of rows are: "+flats.length);        // it will give two because row size is 2
        System.out.println("Number of columns in 0th row are: "+flats[0].length);      // it will give 3 because at row 0 there are 3 columns as (0,0 0,1 0,2) same is true for row 1
        System.out.println("Number of columns in 1th row are: "+flats[0].length);
        System.out.println("Element at index (1,0) is "+flats[1][0]);

        // Displaying 2-D array using for loop
        System.out.println("Printing 2-D array using for loop");
        for(int i=0; i<flats.length; i++)
        {
            for(int j=0; j<flats[i].length; j++)                 // flats[i].length it means (when i=0 flats[0].length) (when i=1 flats[1].length)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }     // end of inner for loop
            System.out.println();
        }       // end of outer for loop

    } // end of main()
} // end of class
