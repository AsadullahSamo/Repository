package ClassPrograms_Lecture_13_to_24;
interface Computer{
     void playingGame();
     void startComputer();
}     // end of interface Computer
class Anonymous{
        void createClass() throws Exception{
            Computer c = new Computer(){
            @Override
            public void startComputer () {
                System.out.println("Starting the PC");
            }
            @Override
            public void playingGame () {
                System.out.println("Playing Rise of the Tomb Raider");
            }
            public void shuttingDown(){
                System.out.println("Windows is shutting down");
            }
            public void restart(){
                System.out.println("Windows is restarting");
            }
        };
            c.startComputer();
            c.playingGame();
           c.getClass().getMethod("restart").invoke(c);
           c.getClass().getMethod("shuttingDown").invoke(c);


    }     // end of createClass() method
}         // end of class Anonymous

public class Anonymous_class_Homework {
    public static void main(String[] args) throws Exception{

        Anonymous a = new Anonymous();
        a.createClass();
    }     // end of main() method
}        //  end of program
