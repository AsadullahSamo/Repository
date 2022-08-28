package ClassPrograms_Lecture_19_to_24;
import java.util.ArrayList;

class YouTube{
    String title, upload_date;
    int views, likes, dislikes;
    long duration;
    ArrayList<String> comments = new ArrayList<String>();

    public void play(String title, String upload_date, long duration){
        this.title = title;
        this.upload_date = upload_date;
        this.duration = duration;
        System.out.println("Video with title "+title+" and duration "+duration+" hours is playing now... and it had uploaded on "+upload_date);
    }    // end of method play()
    public void video(int views, int likes, int dislikes){
        this.likes = likes;
        this.views = views;
        this.dislikes = dislikes;
        System.out.println("Video has "+likes+" likes, "+dislikes+" dislikes and "+views+" views");
    }

    public void forward_toSec(int secs){
        System.out.println("Video 3 is forwarded to "+secs+" seconds");
    }   //  end of method forward_toSec

    public void reverse_toSec(int secs){
        System.out.println("Video 3 is reversed to "+secs+" seconds");
    }  // end of method reverse_toSec

    public void add_Comments(ArrayList<String> comments){
        System.out.println("Comments are ");
        for(int i=0; i<comments.size(); i++) {
            System.out.println(comments.get(i));
        }
    }
}    // end of class YouTube

public class Lecture_19_OOP_Test_Question_01 {
        public static void main(String[] args) {

            // Question 01:
            // Create a YouTube class with attributes title, upload_date, views, likes, dislike, comment(ArrayList)
            // and methods play(), forward_toSec(), reversed_toSec() add_Comments(). Create 3 video objects of the class YouTube
            // and add the necessary values

            ArrayList<String> comments = new ArrayList<>();
            // Adding comments to video
            comments.add("This video is good");
            comments.add("Bro, please upload video regularly");
            comments.add("Please if you upload about Exception handling");


            YouTube video1 = new YouTube();
            YouTube video2 = new YouTube();
            YouTube video3 = new YouTube();

            video1.play("Java MultiThreading", "5 Sep, 2015", 2);
            video2.video(2500, 500, 100);
            video3.forward_toSec(50);
            video3.reverse_toSec(20);
            video1.add_Comments(comments);

        }         // end of main() method
    }            //  end of program

