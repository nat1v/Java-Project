 
package uas1;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksiDatabase {
    
    private static Connection conn;
    
    public static Connection getKoneksi(){
        if (conn == null) {
            try {
                String driver = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/pendaftar";
                String user = "root";
                String password = "makandewa";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Database Berhasil.");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}
    

