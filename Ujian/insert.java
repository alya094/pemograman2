/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ujian;

import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
/**
 *
 * @author LENOVO
 */
public class insert {

    Koneksi conek = new Koneksi(); 
    

    public void insert(String ISBN, String JUDUL, String PENGARANG, String TAHUNTERBIT) {
    String insertquery = "INSERT INTO `identitas_buku`(`ISBN`, `JUDUL`, `PENGARANG`, `TAHUNTERBIT`) VALUES (?, ?, ?, ?)";   
    try {
        conek.RunKoneksi();
    PreparedStatement st = conek.conn.prepareStatement(insertquery);
    st.setString(1, ISBN);
    st.setString(2, JUDUL);
    st.setString(3, PENGARANG);
    st.setString(4, TAHUNTERBIT);  
   
    
    //EKSEKUSI QUERY
    int rowsInserted = st.executeUpdate();
    if(rowsInserted>0)
    {JOptionPane.showMessageDialog(null,"BERHASIL SIMPAN");}
        //System.out.println("BERHASIL INSERT")
    else {
        JOptionPane.showMessageDialog(null,"GAGAL SIMPAN");
        //System.out.println("GAGAL INSERT");
             
    }
    
    }catch(SQLException ex) {
        System.out.println("TERJADI KESALAHAN SIMPAN " + ex);}
    

    

    }}

