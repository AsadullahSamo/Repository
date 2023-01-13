package ClassPrograms_Lecture_13_to_24;
import java.sql.*;

public class Lecture_22_JDBC {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/jdbc", username = "root", password = "asad56@mysql.com";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection com = DriverManager.getConnection(url, username, password);
        Statement st = com.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM department");
        while(rs.next()){
            System.out.print(rs.getInt(1)+" | ");
            System.out.print(rs.getString("Dept_name")+" | ");
            System.out.println(rs.getString("Dept_zone"));
        }
        st.close();
        com.close();

    }       // end of main() method
}          //  end of program
