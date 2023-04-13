import java.sql.*;

public class deleteDatabase {
    static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT * FROM USER";
    
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ){
            String sql = "DELETE FROM USER WHERE id = 103";
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
