/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author LENOVO
 */
public class SIMKRS {
    public static void main(String[] args) {
        MasterMatkul krs = new MasterMatkul();
        Mahasiswa mahasiswa = new Mahasiswa();
        Dosen dosen = new Dosen();
        
        System.out.println("Nama Mahasiswa :"+ mahasiswa.nama);
        System.out.println("Nim : "+ mahasiswa.nim);
        System.out.println("Prodi : "+ mahasiswa.prodi);
        System.out.println("Dosen Wali : "+ dosen.DosenWali);
        System.out.println("__________________________________________________");
        System.out.println("|            KRS MAHASISWA 2024-2025             |");
        System.out.println("__________________________________________________");
        System.out.println("MATA KULIAH    | "
                + " \n | DOSEN PENGAMPU         ");
        System.out.println(         krs.Matku1l + "\n"+
                dosen.DosenPengampu1);
        System.out.println(         krs.Matkul2 + "\n"+
                dosen.DosenPengampu2);
        System.out.println(         krs.Matkul3 + "\n"+
                dosen.DosenPengampu3);
        System.out.println(         krs.Matkul4 + "\n"+
                dosen.DosenPengampu4);
        System.out.println(         krs.Matkul5 + "\n"+
                dosen.DosenPengampu5); 
        System.out.println(         krs.Matkul6 + "\n"+
                dosen.DosenPengampu6);
        System.out.println(         krs.Matkul7 + "\n"+
                dosen.DosenPengampu7);
    }
    
}
