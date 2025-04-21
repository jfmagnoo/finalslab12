import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE students SET course = ? WHERE name = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Information Technology");
            stmt.setString(2, "John Doe");

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student record updated successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
