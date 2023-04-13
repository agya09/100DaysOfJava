import java.sql.*;

public class insertDatabase {
    static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = con.createStatement();
        ){
            System.out.println("Inserting into user table");
            String sql = "INSERT INTO USER VALUES (100,'Agya','Pathak', 22)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO USER VALUES (101,'Anusha','Subedi', 22)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO USER VALUES (102,'Shankar','Lamichhane', 23)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO USER VALUES (103,'Asha','Thapa', 23)";
            stmt.executeUpdate(sql);

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
