package ClassPrograms_Lecture_13_to_24;
class FormatCheck extends Exception{
    FormatCheck(String s){
        super(s);
    }
}
class VideoPlayer{
    String [] format = {"mp4", "avi", "mov", "wmv"};
    boolean flag = false;
    public void check(String name) throws Exception{
        for(int i=0; i< format.length; i++) {
            if (format[i].equals(name)) {
                flag = true;
                break;
            }
        }
        if(!flag){
            throw new FormatCheck("Format not supported");
        }
    }
}

public class Exception_Handling_Class_Work_YT_program {
    public static void main(String[] args) {

        VideoPlayer vp = new VideoPlayer();
        try{
            vp.check("mp4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
