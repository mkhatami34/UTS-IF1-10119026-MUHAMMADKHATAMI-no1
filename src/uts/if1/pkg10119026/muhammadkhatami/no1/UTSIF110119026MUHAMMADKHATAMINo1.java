/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119026.muhammadkhatami.no1;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : IF-1
 * NIM      : 10119026
 * Deskripsi : progam ini menampilkan arti tahun kelahiranmu
 */
public class UTSIF110119026MUHAMMADKHATAMINo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Age umur = new Age(2020);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(scan.nextInt());
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + umur.getYearBirth());
        System.out.println("Hari ini tahun : " + umur.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + umur.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu ".concat(umur.tandanyaKamu(umur.hitungUmur())));
    }
    
}
