/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Printer cetakNama = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan nama anda : ");
        String inputNama = "";
        inputNama+=input.nextLine();
        cetakNama.setNama(inputNama);
        String nama = cetakNama.getNama();
        
        System.out.print("Mau cetak nama berapa kali? ");
        cetakNama.setJmlCetak(input.nextInt());
        int jmlCetak = cetakNama.getJmlCetak();
        input.close();
        
        cetakNama.cetak(nama);
        cetakNama.cetak(jmlCetak, nama);
    }
    
}
