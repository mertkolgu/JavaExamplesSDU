/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _04week;

/**
 *
 * @author Mert
 */
public class Example15 {
    // decimal sayıyı binary sayıya çevirme

    public static String decToBin(int sayi) {

        String sonuc = "";

        while (sayi > 0) {
            int kalan = sayi % 2;
            sonuc = kalan + sonuc;
            sayi = sayi / 2;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        String sonuc = decToBin(10);
        System.out.println(sonuc);
    }
}
