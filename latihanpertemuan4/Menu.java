/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpertemuan4;

/**
 *
 * @author LENOVO
 */
 class Menu {
     String nama;
    double harga;

    // Constructor
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method untuk menampilkan detail menu
    public void tampilkanMenu() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp " + harga);
    }
    
    
}
