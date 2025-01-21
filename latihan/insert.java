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
public class insert {
    String prog;
    koneksi konek = new koneksi();
    public void insert(String nim, String nama, String pengarang, String tahun) {
      
        try {
            
          konek.connection();
          Statement statement = konek.con.createStatement();
          String sql= "INSERT INTO `identitas`(`nim`, `nama`, `alamat`, `gender`)"
                    + "VALUES ('"+nim+"','"+nama+"]','"+pengarang+"','"+tahun+"')";
          statement.executeUpdate(sql);
          statement.close(); 

          JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
