/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119026.muhammadkhatami.no1;

/**
 *
 * @author Asus
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearBirth - yearNow;
    }
    
    public String tandanyaKamu(int umur){
        String tandanyaKamu;
        if (umur >= 0 && umur <= 5) {
            tandanyaKamu = "LAGI LUCU-LUCU NYA";
        } else if (umur > 5 && umur <= 10) {
            tandanyaKamu = "MASIH ANAK-ANAK";
        } else if (umur > 10 && umur <= 13) {
            tandanyaKamu = "MASIH REMAJA";
        } else if (umur > 13 && umur <= 19) {
            tandanyaKamu = "ALAY";
        } else if (umur > 19 && umur <= 29) {
            tandanyaKamu = "LAGI GALAU NYARI JODOH";
        } else if (umur > 29 && umur <= 35) {
            tandanyaKamu = "LAGI SIBUK NYARI UANG";
        } else if (umur > 35 && umur <= 150) {
            tandanyaKamu = "UDAH TUA";
        } else {
            tandanyaKamu = "TIDAK TERDETEKSI KEHIDUPAN";
        }
        
        return red.concat(tandanyaKamu);
    }
    
}
