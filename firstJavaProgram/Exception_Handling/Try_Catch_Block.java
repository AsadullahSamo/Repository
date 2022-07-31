package Exception_Handling;

public class Try_Catch_Block {
    public static void main(String[] args) {

        /*
        Syntax:
        try{
            code to try
        } catch(Exception e){
            code if exception  occurs
        }
         */
        int a = 900, b = 0;
        try{
            int c = a / b;
            System.out.println("The result is "+c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }      // end of catch block
        System.out.println("End of program");

    }       // end of main()
}          //  end of program
