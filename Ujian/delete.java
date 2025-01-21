/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ujian;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class delete {
    Koneksi conek = new Koneksi();
    
    
     //==============QUERY DELETE BERDASAR NIM=====================//
    public void hapus (String ISBN)
    
    {
    try{conek.RunKoneksi();
            Statement st = conek.conn.createStatement();
             String querydel = "DELETE FROM `identitas_buku` where ISBN = '" + ISBN + "'";   
               st.executeUpdate(querydel);
               st.close();
  
        JOptionPane.showMessageDialog(null,"BERHASIL DIHAPUS");
        
       
    }catch (Exception ex)
    {    JOptionPane.showMessageDialog(null,"TERJADI KESALAHAN HAPUS");}
    
    }
    
}