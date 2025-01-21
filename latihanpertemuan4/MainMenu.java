/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpertemuan4;

/**
 *
 * @author LENOVO
 */
public class MainMenu {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing menu
        makanan makanan = new makanan("Nasi Goreng", 20000);
        Minuman minuman = new Minuman("Es Teh", 5000);
        Snack snack = new Snack("Keripik Kentang", 10000);

        // Menampilkan menu
        System.out.println("=== Menu Makanan ===");
        makanan.tampilkanMenu();

        System.out.println("\n=== Menu Minuman ===");
        minuman.tampilkanMenu();

        System.out.println("\n=== Menu Snack ===");
        snack.tampilkanMenu();
    }
}
