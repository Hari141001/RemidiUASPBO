
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harry Kurniawan
 */
public class koneksi {
    Connection con;
    public Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/parkir","root","");
            JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Koneksi");
        }
        return con;
    }

    private static class DriverManager {

        private static Connection getConnection(String jdbcmysqllocalhostparkir, String root, String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public DriverManager() {
        }
    }
}
