import java.sql.*;

public class createTable {
    static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ){
            String sql = "CREATE TABLE USER " +
                         "(id INTEGER not NULL, " +
                         " first VARCHAR(255), " + 
                         " last VARCHAR(255), " + 
                         " age INTEGER, " + 
                         " PRIMARY KEY ( id ))"; 

            stmt.executeUpdate(sql);
            System.out.println("Created table in student database.");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
