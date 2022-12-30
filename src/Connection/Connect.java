package Connection;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static Connection koneksi;

    public static Connection ConfigDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/berlianloundry";  // url database
            String user = "root";                                       //id user db_mysql
            String pass = "";                                           // password db_mysql
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); //driver 
            koneksi = DriverManager.getConnection(url, user, pass);         //koneksi driver ke mysql
        } catch (HeadlessException | SQLException e) {
            System.out.println("Koneksi Gagal" + e.getMessage());
        }
        return koneksi;
    }

}
