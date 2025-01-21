/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ujian;

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
       Koneksi conek = new Koneksi(); 
 
    
   public void update(String ISBN, String JUDUL, String PENGARANG, String TAHUNTERBIT){

        
         try{
          conek.RunKoneksi();
          Statement st = conek.conn.createStatement();
          String update_JUDUL="update identitas_buku set JUDUL='" + JUDUL + "'where ISBN='" + ISBN +"'";
          String update_PENGARANG="update identitas_buku set PENGARANG='" + PENGARANG + "'where ISBN='" +ISBN+"'";
          String update_TAHUNTERBIT="update identitas_buku set TAHUNTERBIT='" + TAHUNTERBIT + "'where ISBN='" +ISBN+"'";
          

          st.executeUpdate(update_JUDUL);
          st.executeUpdate(update_PENGARANG);
          st.executeUpdate(update_TAHUNTERBIT);
         
          st.close();
          
          JOptionPane.showMessageDialog(null, "BERHHASIL DIUBAH");
        }catch (Exception ex)
        {JOptionPane.showMessageDialog(null, ex);
        }
    }
}


