/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
public class method {
    int sisi = 15;
    void HitungLuasPersegi () {
        int luas = sisi*sisi;
        System.out.println("sisi = " + sisi);
        System.out.println("LuasPersegi = " + luas);
    }
    int KelilingPersegi(){
        int keliling = 4 * sisi;
        return keliling;
    }
    public static void main(String[] args) {
        method P = new method();
        P.HitungLuasPersegi();
        System.out.println("KelilingPersegi=" + P.KelilingPersegi());
    }
}
