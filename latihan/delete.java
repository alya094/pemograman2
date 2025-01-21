/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class delete {
      koneksi konek = new koneksi();
      String connection;

    public void delete(String nim) {

        try {

            konek.connection();
             Statement statement = (Statement) konek.con.createStatement();
             
                String sql = "delete from identitas where nim ='" + nim + "'";
                statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

