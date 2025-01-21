/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
public class Parameter {
    public void LuasPersegi (int sisi){
        int Luas = sisi*sisi;
        System.out.println("sisi="+sisi);
    }
    public int keliling (int sisi){
        int keliling =4 * sisi;
        return keliling;
    }
    public static void main(String[] args) {
        Parameter PP= new Parameter();
        PP.LuasPersegi(15);
        System.out.println(PP.keliling(15));
    }
    
    
}
