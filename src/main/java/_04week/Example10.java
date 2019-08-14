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
public class Example10 {

    public static void main(String[] args) {
        // asal sayılar

        int sayi = 2, adet = 0, bolenSayisi;

        while (adet < 50) {
            bolenSayisi = 0;
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    bolenSayisi++;
                }
                if (bolenSayisi > 2) {
                    break;
                }
            }

            if (bolenSayisi == 2) {
                System.out.printf("%d\t", sayi);
                adet++;
                if (adet % 10 == 0) {
                    System.out.println("");
                }
            }
            sayi++;
        }
    }
}
