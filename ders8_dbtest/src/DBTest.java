import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {

    public DBTest() {

        try {
            Class.forName("org.h2.Driver");

            Connection conn = DriverManager.getConnection ("jdbc:h2:tcp://localhost:9092/~/test", "sa","sa");
            //Connection conn = DriverManager.getConnection ("jdbc:h2:~/test", "sa","sa");

            Statement st = conn.createStatement();
            Statement stUpdate = conn.createStatement();

            String sql = "SELECT * FROM TEST_SCHEMA.TEST";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String surname = rs.getString("SURNAME");
                System.out.println("ID-NAME-SURNAME:" + id + "-" +  name + "-" + surname);
                String sqlInsert = "INSERT INTO TEST_SCHEMA.TEST_ARSIV VALUES (" + id + ",'" + name + "','" + surname + "')";
                int i = stUpdate.executeUpdate(sqlInsert);
                System.out.println("i = " + i);
                if (i > 0) {
                    System.out.println("ROW INSERTED");
                }
            }

            conn.close();
        } catch (Exception e) {
            System.err.println("Hata:" + e.getMessage());
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        new DBTest();
    }

}
