package ClassPrograms;
class Demo2{
    String first_name;
    String middle_name;
    String last_name;
    public void setName(String first_name){
        this.first_name = first_name;
    }
    public void setName(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public void setName(String first_name, String middle_name, String last_name){
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
    }
    String getName(){
        if(this.middle_name==null && this.last_name==null)
            return first_name;
        else if(this.middle_name == null)
            return first_name+" "+last_name;
        else
            return first_name+" "+middle_name+" "+last_name;
    }
}   // end of class Demo2

class Car2{
    String first_name;
    String middle_name;
    String last_name;
    public void setName(String first_name){
        this.first_name = first_name;
    }
    public void setName(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public void setName(String first_name, String middle_name, String last_name){
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
    }
    public String getName(){
        if(this.middle_name==null && this.last_name==null)
            return first_name;
        else if(this.middle_name==null)
            return first_name+" "+last_name;
        else
            return first_name+" "+middle_name+" "+last_name;
    }
}

public class Lecture_06_Question {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        d1.setName("Asad");
        Demo2 d2 = new Demo2();
        d2.setName("Asad", "Samo");
        Demo2 d3 = new Demo2();
        d3.setName("John", "Bradley", "Shaw");
        System.out.println(d1.getName());
        System.out.println(d2.getName());
        System.out.println(d3.getName());

        Car2 c1 = new Car2();
        c1.setName("Asad");
        Car2 c2 = new Car2();
        c2.setName("Uzair", "Hussain");
        Car2 c3 = new Car2();
        c3.setName("Waryal", "Muzamil", "Memon");
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
    }
}
