import java.sql.*;

public class retrieve {
    static final String DB_URL = "jdbc:mysql://localhost:3306/Employee";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT * FROM emp";

    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        ){
            while(rs.next()){
                int id = rs.getInt("id");
                String first = rs.getString("first");
                String last = rs.getString("last");
                int age = rs.getInt("age");
                System.out.println("ID: " + id);
                System.out.println("First Name: " + first);
                System.out.println("Last Name: " + last);
                System.out.println("Age: " + age);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
