/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
public class Static {
    public static void luas(int sisi){
        int luas = sisi*sisi;
            System.out.println("luas");
    }
    public static int keliling (int sisi){
        int keliling= 4*sisi;
        return keliling;
    }
    public static void main(String[] args) {
        luas(15);
        System.out.println(keliling(15));
    }
    
}
