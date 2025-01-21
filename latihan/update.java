/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import Ujian.Koneksi;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author LENOVO
 */

   public class update {
       koneksi konek = new koneksi(); 
 
    
   public void update(String nim, String nama, String alamat, String gend){

        
         try {
            konek.connection();
            java.sql.Statement update = konek.con.createStatement();
            String sql = "UPDATE `identitas` SET `nim`='"+nim+"',`nama`='"+nama+"',`alamat`='"+alamat+"',`gender`='"+gend+"' WHERE `nim`='"+nim+"'";
            update.executeUpdate(sql);
            update.close();
            System.out.println("Updating succes...");
            
            //update.close;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}

    








