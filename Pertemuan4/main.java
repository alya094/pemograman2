/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
    enemy monster = new enemy();
    zombie zumbi = new zombie();
    pocong poci = new pocong();
    burung garuda = new burung();
    
        monster.nama=("stego");
        monster.hp=66;
        monster.attackpoin=555;
      
        zumbi.attack();
        poci.attack();
        garuda.attack();
    }
}
