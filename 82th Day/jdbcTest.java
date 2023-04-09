import java.sql.*;

public class jdbcTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "root";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE students (id INT NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
