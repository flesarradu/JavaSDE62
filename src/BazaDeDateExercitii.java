import java.sql.*;
import java.util.Calendar;

public class BazaDeDateExercitii {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,"root","passwd");
            Statement stmt = conn.createStatement();
/*
            String insertQuery = "INSERT INTO city (Name, CountryCode, District, Population) VALUES (?, ?, ?, ?)";

            PreparedStatement  preparedStatement = conn.prepareStatement(insertQuery);
            preparedStatement.setString(1, "Focsani");
            preparedStatement.setString(2, "ROM");
            preparedStatement.setString(3, "Vrancea");
            preparedStatement.setInt(4, 97186);

            preparedStatement.execute();

 */

            ResultSet rs;

            rs = stmt.executeQuery("SELECT COUNT(*) AS 'Numarul tarilor' FROM city WHERE CountryCode = 'ROM' ");
            while ( rs.next() ) {
                String name = rs.getString("Numarul tarilor");
                System.out.println(name + " - ");
            }



            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
