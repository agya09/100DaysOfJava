import java.sql.*;

public class delete {
    static final String DB_URL = "jdbc:mysql://localhost:3306/Employee";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT * FROM emp";
    
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ){
            String sql = "DELETE FROM emp WHERE id = 13";
            stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("First: " + rs.getString("first"));
                System.out.println("Age: " + rs.getInt("age"));
            }
            rs.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
