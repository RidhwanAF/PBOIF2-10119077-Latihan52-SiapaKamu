/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan52.siapakamu;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF - 2
 * Deskripsi    : Menampilkan Siapa Kamu
 */
public class PBOIF210119077Latihan52SiapaKamu {

    
    public static void main(String[] args) {
        Mahasiswa objMahasiswa = new Mahasiswa();
        Dosen objDosen  = new Dosen();
       
        objDosen.setNip("41227829930");
        System.out.println("NIP DOSEN   : "+objDosen.getNip());
        objDosen.siapaKamu();
        objDosen.mengajarApa();
        System.out.println("");
        objMahasiswa.setNim("10110269");
        objMahasiswa.setKelas("PBO2");
        System.out.println("NIM MAHASISWA : "+objMahasiswa.getNim());
        objMahasiswa.siapaKamu();
        objMahasiswa.kelasApa();
    }
    
}
