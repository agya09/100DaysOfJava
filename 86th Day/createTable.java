import java.sql.*;

public class createTable {
    static final String DB_URL = "jdbc:mysql://localhost:3306/Employee";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ){
            String sql = "CREATE TABLE emp " +
                         "(id INTEGER not NULL, " +
                         " first VARCHAR(255), " + 
                         " last VARCHAR(255), " + 
                         " age INTEGER, " + 
                         " PRIMARY KEY ( id ))"; 

            stmt.executeUpdate(sql);
            System.out.println("Created table in employee database.");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
