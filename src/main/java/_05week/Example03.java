/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _05week;

import java.util.Scanner;

/**
 *
 * @author Mert
 */
public class Example03 {
    // decimal sayıyı hexadecimal sayıya çevirme

    public static String decToHex(int sayi) {

        String sonuc = "";
        while (sayi > 0) {
            int kalan = sayi % 16;
            sayi = sayi / 16;
            if (kalan <= 9) {
                sonuc = kalan + sonuc;
            } else if (kalan == 10) {
                sonuc = "A" + sonuc;
            } else if (kalan == 11) {
                sonuc = "B" + sonuc;
            } else if (kalan == 12) {
                sonuc = "C" + sonuc;
            } else if (kalan == 13) {
                sonuc = "D" + sonuc;
            } else if (kalan == 14) {
                sonuc = "E" + sonuc;
            } else if (kalan == 15) {
                sonuc = "F" + sonuc;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sayi;
        
        System.out.print("Decimal Sayıyı Giriniz : ");
        sayi = sc.nextInt();
        
        System.out.println("Hexadecimal Sonuç = " + decToHex(sayi));
    }
}
